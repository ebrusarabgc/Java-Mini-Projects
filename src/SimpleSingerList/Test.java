package SimpleSingerList;

import java.util.Scanner;

public class Test {
    private static final Singers singers = new Singers();
    private static final Scanner scanner = new Scanner(System.in);

    public static void printOperations() {
        System.out.println("""
                \t 0- View the operations
                 \t 1-View the singers
                 \t 2-Add a singer
                 \t 3-Change a singer
                 \t 4-Remove a singer
                 \t 5-Search a singer
                 \t 6-Quit the application""");
    }

    public static void viewSingers() {
        singers.printSingers();
    }

    public static void addSinger() {
        String name;

        System.out.print("Please enter the name of the singer you want to add: ");
        name = scanner.nextLine();

        singers.addSinger(name);
    }

    public static void changeSinger() {
        int pos;
        String name;

        System.out.print("Please enter the position of the singer you want change: ");
        pos = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Please enter the name of the new singer: ");
        name = scanner.nextLine();

        singers.changeSinger(pos, name);
    }

    public static void removeSinger() {
        int pos;

        System.out.print("Please enter the position of the singer you want to remove: ");
        pos = scanner.nextInt();

        scanner.nextLine();

        singers.removeSinger(pos);
    }

    public static void searchSinger() {
        String name;

        System.out.print("Please enter the name of the singer you want to search: ");
        name = scanner.nextLine();

        singers.searchSinger(name);
    }

    public static void quit() {
        System.out.println("Quiting the singer list application...");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the singer list application...");
        printOperations();

        boolean quit = false;

        int operation;

        while (!quit) {
            System.out.println("Choose an operation:");

            operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 0 -> printOperations();
                case 1 -> viewSingers();
                case 2 -> addSinger();
                case 3 -> changeSinger();
                case 4 -> removeSinger();
                case 5 -> searchSinger();
                case 6 -> {
                    quit = true;
                    quit();
                }
                default -> System.out.println("Invalid operation.");
            }
        }
    }
}
