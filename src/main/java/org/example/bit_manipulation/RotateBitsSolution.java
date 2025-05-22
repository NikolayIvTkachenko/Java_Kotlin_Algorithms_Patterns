package org.example.bit_manipulation;

public class RotateBitsSolution {

    public static void main(String[] args) {

        int number = 423099897;
        int bits = 10;

        int resultLeft = leftRotate(number, bits);
        int resultRight = rightRotate(number, bits);

        System.out.println("Initial:\t" + Integer.toBinaryString(number));
        System.out.println("Result-left:\t" + Integer.toBinaryString(resultLeft));

        System.out.println();

        System.out.println("Initial:\t" + Integer.toBinaryString(number));
        System.out.println("Result-right:\t" + Integer.toBinaryString(resultRight));
    }

    private static final int MAX_INT_BITS = 32;

    public static int leftRotate(int n, int bits) {

        if (n < 0) {
            return -1;
        }

        int fallBits = n << bits;
        int fallBitsShiftToRight = n >> (MAX_INT_BITS - bits);

        return fallBits | fallBitsShiftToRight;
    }

    public static int rightRotate(int n, int bits) {

        if (n < 0) {
            return -1;
        }

        int fallBits = n >> bits;
        int fallBitsShiftToLeft = n << (MAX_INT_BITS - bits);

        return fallBits | fallBitsShiftToLeft;
    }
}
