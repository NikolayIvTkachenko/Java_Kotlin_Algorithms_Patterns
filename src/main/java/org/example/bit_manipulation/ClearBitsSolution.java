package org.example.bit_manipulation;

public class ClearBitsSolution {

    public static void main(String[] args) {

        int number = 423;
        int position = 6;

        int result1 = clearFromMsb(number, position);
        int result2 = clearFromPosition(number, position);

        System.out.println("Initial:\t\t\t\t" + Integer.toBinaryString(number));
        System.out.println("Result (clearFromMsb()):\t\t" + Integer.toBinaryString(result1));

        System.out.println("Initial:\t\t\t\t" + Integer.toBinaryString(number));
        System.out.println("Result (clearFromPosition()):\t\t" + Integer.toBinaryString(result2));
    }

    public static int clearFromMsb(int n, int k) {

        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("The position must be between 0 and 31");
        }

        return n & ((1 << k) - 1);
    }

    public static int clearFromPosition(int n, int k) {

        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("The position must be between 0 and 31");
        }

        return n & ~((1 << k) - 1);
    }

}
