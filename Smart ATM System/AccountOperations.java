public interface AccountOperations {

    void checkBalance(BankAccount account);

    void depositMoney(BankAccount account, double amount);

    void withdrawMoney(BankAccount account, double amount);
}