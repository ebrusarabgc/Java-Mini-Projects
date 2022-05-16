package SimpleExerciseProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the exercise program!");

        String exercises = """
                --Valid exercise types--\s
                Burpee\s
                Push up\s
                Sit up\s
                Squat""";

        System.out.println(exercises);
        System.out.println("--Make an exercise plan--");

        System.out.print("Burpee number: ");
        int burpee = scanner.nextInt();

        System.out.print("Push up number: ");
        int pushUp = scanner.nextInt();

        System.out.print("Sit up number: ");
        int sitUp = scanner.nextInt();

        System.out.print("Squat number: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Exercise exercise = new Exercise(burpee, pushUp, sitUp, squat);

        System.out.println("Starting exercise...");

        while (!exercise.isOver()) {
            System.out.println("--Enter the move to be made--");
            System.out.println(exercises);
            String move = scanner.nextLine();

            System.out.println("--Enter how many moves to be made--");
            int num = scanner.nextInt();
            scanner.nextLine();

            exercise.doExercise(move, num);
        }

        System.out.println("You have completed the planned exercise. Exiting the program...");

    }
}
