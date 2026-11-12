public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, String accountNumber, double balance) {

        super(name, accountNumber, balance);
    }

    // Method Overriding
    @Override
    public void showAccountType() {

        System.out.println("Account Type: Savings Account");
    }
}