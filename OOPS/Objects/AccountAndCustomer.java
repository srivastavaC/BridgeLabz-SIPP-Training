import java.util.HashMap;
import java.util.Scanner;

public class AccountAndCustomer {

    
    static class Bank {
        private String bankName;
        private HashMap<Integer, Double> accounts;
        private int nextAccountNumber;

        public Bank(String bankName) {
            this.bankName = bankName;
            this.accounts = new HashMap<>();
            this.nextAccountNumber = 1001;
        }

        public int openAccount(Customer customer, double initialDeposit) {
            int accountNumber = nextAccountNumber++;
            accounts.put(accountNumber, initialDeposit);
            customer.setBank(this);
            customer.setAccountNumber(accountNumber);
            System.out.println("✅ Account opened for " + customer.getName() +
                               " in " + bankName + " with account number: " + accountNumber);
            return accountNumber;
        }

        public double getBalance(int accountNumber) {
            return accounts.getOrDefault(accountNumber, 0.0);
        }

        public String getBankName() {
            return bankName;
        }
    }

    
    static class Customer {
        private String name;
        private int accountNumber;
        private Bank bank;

        public Customer(String name) {
            this.name = name;
        }

        public void viewBalance() {
            if (bank != null) {
                double balance = bank.getBalance(accountNumber);
                System.out.println("💰 " + name + ", your balance at " + bank.getBankName() + " is: ₹" + balance);
            } else {
                System.out.println("⚠️ No bank account found for " + name);
            }
        }

        public String getName() {
            return name;
        }

        public void setBank(Bank bank) {
            this.bank = bank;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("OpenAI Bank");

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Customer customer = new Customer(name);

        System.out.print("Enter initial deposit amount: ₹");
        double deposit = scanner.nextDouble();

        bank.openAccount(customer, deposit);

        System.out.println();
        customer.viewBalance();

        scanner.close();
    }
}
