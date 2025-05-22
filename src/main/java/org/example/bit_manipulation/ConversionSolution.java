package org.example.bit_manipulation;

public class ConversionSolution {

    public static void main(String[] args) {

        int q = 290932;
        int p = 352345;

        int result = count(q, p);

        System.out.println("q: " + Integer.toBinaryString(q));
        System.out.println("p: " + Integer.toBinaryString(p));

        System.out.println("\nResult: " + result);
    }

    public static int count(int q, int p) {

        if (q < 0 || p < 0) {
            throw new IllegalArgumentException("The q and p numbers must be positive");
        }

        int count = 0;

        int xor = q ^ p; // each 1 represents a bit that is different between q and p

        while (xor != 0) {
            count += xor & 1; // only 1 & 1 = 1
            xor = xor >> 1;
        }

        return count;
    }
}
