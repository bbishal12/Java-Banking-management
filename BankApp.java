import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Bank Account Management System ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        String accNum = scanner.nextLine();

        BankAccount account = new BankAccount(name, accNum); // create account object

        int choice;
        do {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Display Account Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.displayAccInfo();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.showBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

