import java.util.ArrayList;

public abstract class BankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    private ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(String name, String accountNumber, double balance) {

        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

        transactions.add("Account Created: " + balance);
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method Overloading
    public void deposit(double amount) {
        deposit(amount, "Normal Deposit");
    }

    public void deposit(double amount, String note) {

        if (amount > 0) {

            balance += amount;

            transactions.add("Deposited: " + amount + " (" + note + ")");

            System.out.println("Deposit Successful!");

        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            transactions.add("Withdrawn: " + amount);

            System.out.println("Withdrawal Successful!");

        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    public void showTransactions() {

        System.out.println("\n--- Transaction History ---");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void showAccountInfo() {

        System.out.println("\n--- Account Information ---");

        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Abstraction
    public abstract void showAccountType();
}