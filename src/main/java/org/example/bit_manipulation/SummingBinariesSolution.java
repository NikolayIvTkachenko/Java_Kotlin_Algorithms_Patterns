package org.example.bit_manipulation;

public class SummingBinariesSolution {

    public static void main(String[] args) {

        int q = 23;
        int p = 45;

        int result = sum(q, p);

        System.out.println(q + "(" + Integer.toBinaryString(q) + ")" + " + "
                + p + "(" + Integer.toBinaryString(p) + ")" + " = " + result
                + "(" + Integer.toBinaryString(result) + ")");

        System.out.println();
    }

    // using the equation, p + q = 2 * (p & q) + (p ^ q)
    public static int sum(int q, int p) {

        int xor;
        int and;
        int t;

        and = q & p;
        xor = q ^ p;

        // force and to return 0
        while (and != 0) {

            and = and << 1; // this is multiplication by 2

            // prepare the next step of recursion
            t = xor ^ and;
            and = and & xor;
            xor = t;
        }

        return xor;
    }
}
