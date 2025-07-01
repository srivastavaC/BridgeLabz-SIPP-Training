public class Account {
    private String bankName;
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Account(String bankName, String accountHolderName, String accountNumber, double initialBalance) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void openAccount() {
        System.out.println("Account opened successfully for " + accountHolderName + " at " + bankName);
    }

    public void viewBalance() {
        System.out.println("Current balance for " + accountHolderName + ": $" + balance);
    }

    public static void main(String[] args) {
        Account account = new Account("City Bank", "John Doe", "123456789", 1000.00);
        account.openAccount();
        account.viewBalance();
    }
    
}
