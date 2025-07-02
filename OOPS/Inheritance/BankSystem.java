class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int durationInMonths;

    FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Duration: " + durationInMonths + " months");
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA98765", 25000, 10000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA54321", 100000, 12);

        System.out.println("--- SAVINGS ACCOUNT ---");
        sa.displayAccountType();
        System.out.println("\n--- CHECKING ACCOUNT ---");
        ca.displayAccountType();
        System.out.println("\n--- FIXED DEPOSIT ACCOUNT ---");
        fda.displayAccountType();
    }
}
