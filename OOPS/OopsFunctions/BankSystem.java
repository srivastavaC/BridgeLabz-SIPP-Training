interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}


abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

   
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

   
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    
    public abstract double calculateInterest();

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest: ₹" + calculateInterest());
        System.out.println("Loan Eligibility: ₹" + calculateLoanEligibility());
        System.out.println("--------------------------");
    }
}


class SavingsAccount extends BankAccount {
    private final double interestRate = 0.04; 

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; 
    }
}


class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 50000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.0; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; 
    }
}


public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new SavingsAccount("SA101", "Alice", 20000);
        accounts[1] = new CurrentAccount("CA202", "Bob", 50000);

        System.out.println("=== Bank Account Details ===\n");

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            acc.deposit(1000);
            acc.withdraw(3000);
            acc.applyForLoan(100000);
            System.out.println();
        }
    }
}
