import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Polymorphism
        BankAccount account = new SavingsAccount(
                "Bappy", "123456789", 5000
        );

        ATM atm = new ATM();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("       SMART ATM SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Account Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Account Type");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    account.showAccountInfo();
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double deposit = input.nextDouble();

                    atm.depositMoney(account, deposit);
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    double withdraw = input.nextDouble();

                    atm.withdrawMoney(account, withdraw);
                    break;

                case 4:
                    atm.checkBalance(account);
                    break;

                case 5:
                    account.showTransactions();
                    break;

                case 6:
                    account.showAccountType();
                    break;

                case 0:
                    System.out.println("Thank You for Using Smart ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        input.close();
    }
}