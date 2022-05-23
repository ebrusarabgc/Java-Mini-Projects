package BeybladeFactoryProgram;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Polymorphism kullanarak Beyblade programı

        System.out.println("Welcome to Beyblade Program...");
        System.out.println("Press 'q' to quit.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which Beyblade do you want to produce?");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Quiting program...");
                break;
            } else {
                BeybladeFactory factory = new BeybladeFactory();
                Beyblade beyblade = factory.produceBeyblade(operation);

                if (beyblade == null) {
                    System.out.println("Please enter valid Beyblade name...");
                } else {
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.showBitBeast();
                }
            }
        }
    }
}
