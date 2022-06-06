package SimpleMathsAndPhysicsCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to mathematics and physics calculator program...");

        String operations = """
                Choose an operation:\s
                1- Calculate area of a circle\s
                2- Calculate perimeter of a triangle\s
                3- Calculate the inner product of two vectors\s
                4- Quit program""";

        boolean isQuit = false;

        while (!isQuit) {
            System.out.println(operations);
            String choice = scanner.next();

            switch (choice) {
                case "1" -> {
                    System.out.println("What is the radius of the circle?");
                    int radius = scanner.nextInt();
                    scanner.nextLine();
                    Problem.Mathematics.circleArea(radius);
                }
                case "2" -> {
                    System.out.println("What are the edges of the triangle?");
                    System.out.print("Edge 1: ");
                    int a = scanner.nextInt();
                    System.out.print("Edge 2: ");
                    int b = scanner.nextInt();
                    System.out.print("Edge 3: ");
                    int c = scanner.nextInt();
                    Problem.Mathematics.trianglePerimeter(a, b, c);
                }
                case "3" -> {
                    System.out.println("Please enter the two vectors");
                    Vec vec1 = new Vec("Vector1");
                    Vec vec2 = new Vec("Vector2");
                    Problem.Physics.innerProduct(vec1, vec2);
                }
                case "4" -> isQuit = true;
                default -> System.out.println("Invalid choice...");
            }
        }
    }
}
