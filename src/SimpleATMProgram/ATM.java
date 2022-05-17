package SimpleATMProgram;

import java.util.Scanner;

public class ATM {

    public void run(Account account) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM program...");
        System.out.println("User Login");

        int rightOfEntry = 3;

        while (true) {
            if (!LogIn.logIn(account)) {
                rightOfEntry--;
                System.out.println("Wrong user name or password.");
            } else {
                System.out.println("Login successful.");
                break;
            } if (rightOfEntry == 0) {
                System.out.println("Your remaining access rights have expired.");
                return;
            }
            System.out.println("Your remaining access right is: " + rightOfEntry);
        }

        String operations = """
                1. View Balance
                2. Deposit Money
                3. Withdraw Money
                Press q to exit.""";

        System.out.println();
        System.out.println(operations);

        label:
        while (true) {
            System.out.println("Select an operation to do: ");

            String operation = scanner.next();

            switch (operation) {
                case "q":
                    break label;
                case "1":
                    System.out.println("Your Balance: " + account.getBalance());
                    break;
                case "2": {
                    System.out.print("Enter the amount value to deposit: ");

                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    account.depositMoney(amount);
                    break;
                }
                case "3": {
                    System.out.println("Enter the amount value to withdraw: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    account.withdrawMoney(amount);
                    break;
                }
                default:
                    System.out.println("Invalid operation...");
                    break;
            }

        }

    }

}
