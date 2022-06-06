package SimpleMathsAndPhysicsCalculator;

import java.util.Scanner;

public class Vec {
    protected String name;
    protected int i;
    protected int j;
    protected int k;

    public Vec(String name) {
        this.name = name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i, j and k values of " + name);

        System.out.print("i: ");
        int i = scanner.nextInt();

        System.out.print("j: ");
        int j = scanner.nextInt();

        System.out.print("k: ");
        int k = scanner.nextInt();

        this.i = i;
        this.j = j;
        this.k = k;
    }

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
