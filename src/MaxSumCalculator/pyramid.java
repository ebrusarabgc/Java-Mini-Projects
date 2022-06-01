package MaxSumCalculator;

import java.util.Scanner;

public class pyramid {
    // Finding maximum sum of NON-prime numbers in a pyramid

    public static int maxSum(int[][] pyramid, int i, int j, int row, int col) {
        if (isPrime(pyramid[i][j])) {
            return 0;
        }
        if (i == row - 1) {
            return pyramid[i][j];
        }
        if (j == col) {
            return 0;
        }
        return pyramid[i][j]
                + Math.max(
                    maxSum(pyramid, i + 1, j, row, col),
                    maxSum(pyramid, i + 1, j + 1, row, col));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        int a = (int) (Math.sqrt(2 * arr.length) - 1/2);
        int[][] pyramid = new int[a][a];
        int count = 0;


        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = Integer.parseInt(arr[count]);
                count++;
            }

        }

        System.out.println(maxSum(pyramid,0,0,a,a));
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
