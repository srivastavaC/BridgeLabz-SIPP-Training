public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("This is not a valid BankAccount instance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice Smith", "BA123456");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        
        BankAccount account2 = new BankAccount("Bob Johnson", "BA654321");
        account2.deposit(1000.0);
        account2.displayAccountDetails();
        
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}