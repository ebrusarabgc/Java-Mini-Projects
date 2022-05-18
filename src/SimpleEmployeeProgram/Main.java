package SimpleEmployeeProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the employee program!");

        String operations = """
                Operations:
                1 - Developer Operations
                2 - Manager Operations
                q - Quit""";

        String operation;

        label:
        while (true) {
            System.out.println("Choose an operation...");
            System.out.println(operations);

            operation = scanner.nextLine();

            switch (operation) {
                case "1":
                    Developer developer = new Developer("Ebru", "Bağca", 2, "Java");
                    String devOperations = """
                            Developer Operations:
                            1 - Show Information
                            2 - Format
                            q - Quit""";

                    String devOperation;

                    devLabel:
                    while (true) {
                        System.out.println("Choose a developer operation...");
                        System.out.println(devOperations);

                        devOperation = scanner.nextLine();

                        switch (devOperation) {
                            case "1":
                                developer.showInfo();
                                break;
                            case "2":
                                System.out.print("OS: ");
                                String OS = scanner.nextLine();

                                developer.format(OS);
                                break;
                            case "q":
                                System.out.println("Quiting from developer operations...");
                                break devLabel;
                            default:
                                System.out.println("Please choose a valid operation...");
                                break;
                        }
                    }
                    break;
                case "2":
                    Manager manager = new Manager("Hera", "Uzumaki", 1, 5);

                    String manOperations = """
                            Manager Operations:
                            1 - Show Information
                            2 - Fire Someone
                            3 - Hire Someone
                            q - Quit""";

                    String manOperation;

                    manLabel:
                    while (true) {
                        System.out.println("Choose a manager operation...");
                        System.out.println(manOperations);

                        manOperation = scanner.nextLine();

                        switch (manOperation) {
                            case "1":
                                manager.showInfo();
                                break;
                            case "2":
                                manager.fire();
                                break;
                            case "3":
                                manager.hire();
                                break;
                            case "q":
                                System.out.println("Quiting from manager operations...");
                                break manLabel;
                            default:
                                System.out.println("Please choose a valid operation...");
                                break;
                        }
                    }
                    System.out.println();
                    break;
                case "q":
                    System.out.println("Quiting from the program...");
                    break label;
                default:
                    System.out.println("Please choose a valid operation...");
                    break;
            }
        }


    }
}
