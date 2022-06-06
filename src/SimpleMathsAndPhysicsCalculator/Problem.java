package SimpleMathsAndPhysicsCalculator;

public class Problem {
    public static class Mathematics {
        public static double pi = Math.PI;

        public static void circleArea(int radius) {
            System.out.println("The area of the circle is " + Math.pow(radius, 2) * pi);
        }

        public static void trianglePerimeter(int a, int b, int c) {
            if(!isTriangle(a, b, c)) {
                System.out.println("This values does not provide the rule of being triangle.");
                return;
            }
            System.out.println("The perimeter of the triangle is " + (a + b + c));
        }

        public static boolean isTriangle(int a, int b, int c) {
            return (a + b > c) & (a + c > b) & (b + c > a) & (a > Math.abs(b - c)) & (b > Math.abs(a - c)) & (c > Math.abs(a - b));
        }

    }

    public static class Physics {
        public static void innerProduct(Vec vector1, Vec vector2) {
            int product = vector1.getI() * vector2.getI() + vector1.getJ() * vector2.getJ() + vector1.getK() * vector2.getK();

            System.out.println("The inner product of " + vector1.getName() + " and " + vector2.getName() + " is " + product);
        }
    }
}
