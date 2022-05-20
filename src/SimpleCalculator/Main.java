package SimpleCalculator;

import java.util.Scanner;

public class Main {
    // Simple calculator using method overloading

    public static int addition(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber * secondNumber * thirdNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator program!");

        while (true) {
            System.out.println("Choose the operation you want to do. If you want to quit, press 'q'.");
            System.out.println("1 --> +, 2 --> -, 3 --> *, 4 --> /");

            String operation = scanner.next();
            boolean addThird = false;

            if (operation.equals("q")) {
                System.out.println("Quiting the program...");
                break;
            }

            if (!(operation.equals("1") || operation.equals("2") || operation.equals("3") || operation.equals("4"))) {
                System.out.println("Please enter a valid operation...");
                System.out.println("1 --> +, 2 --> -, 3 --> *, 4 --> /");

                operation = scanner.next();
            }

            if (operation.equals("1") || operation.equals("3")) {
                System.out.print("Are you going to do the operation with 2 numbers or 3 numbers?");
                int answer = scanner.nextInt();

                while (answer != 3 && answer != 2) {
                    System.out.println("Please enter a valid number.");
                    answer = scanner.nextInt();
                }

                if (answer == 3) {
                    addThird = true;
                }
            }

            double result = 0;

            System.out.print("The first number: ");
            int first = scanner.nextInt();

            System.out.print("The second number: ");
            int second = scanner.nextInt();

            switch (operation) {
                case "1":
                    if (addThird) {
                        System.out.println("The third number: ");
                        int third = scanner.nextInt();

                        result = addition(first, second, third);
                    } else {
                        result = addition(first, second);
                    }
                    break;
                case "2":
                    result = subtraction(first, second);
                    break;
                case "3":
                    if (addThird) {
                        System.out.print("The third number: ");
                        int third = scanner.nextInt();

                        result = multiplication(first, second, third);
                    } else {
                        result = multiplication(first, second);
                    }
                    break;
                case "4":
                    result = division(first, second);
                    break;
            }

            System.out.println("The result is " + result);
        }
    }
}
