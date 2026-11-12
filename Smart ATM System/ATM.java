public class ATM implements AccountOperations {

    @Override
    public void checkBalance(BankAccount account) {

        System.out.println("Current Balance: "
                + account.getBalance());
    }

    @Override
    public void depositMoney(BankAccount account, double amount) {

        account.deposit(amount);
    }

    @Override
    public void withdrawMoney(BankAccount account, double amount) {

        account.withdraw(amount);
    }
}