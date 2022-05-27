package MaxSumCalculator;

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
        int[][] pyramid = {
                {215},
                {193, 124},
                {117, 237, 442},
                {218, 935, 347, 235},
                {320, 804, 522, 417, 345},
                {229, 601, 723, 835, 133, 124},
                {248, 202, 277, 433, 207, 263, 257},
                {359, 464, 504, 528, 516, 716, 871, 182},
                {461, 441, 426, 656, 863, 560, 380, 171, 923},
                {381, 348, 573, 533, 447, 632, 387, 176, 975, 449},
                {223, 711, 445, 645, 245, 543, 931, 532, 937, 541, 444},
                {330, 131, 333, 928, 377, 733, 17, 778, 839, 168, 197, 197},
                {131, 171, 522, 137, 217, 224, 291, 413, 528, 520, 227, 229, 928},
                {223, 626, 34, 683, 839, 53, 627, 310, 713, 999, 629, 817, 410, 121},
                {924, 622, 911, 233, 325, 139, 721, 218, 253, 223, 107, 233, 230, 124, 233}};

        System.out.println(maxSum(pyramid,0,0,15,15));

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
