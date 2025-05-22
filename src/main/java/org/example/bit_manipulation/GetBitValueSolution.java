package org.example.bit_manipulation;

public class GetBitValueSolution {


    public static void main(String[] args) {

        int number = 423;
        int position = 7;

        char result = getValue(number, position);

        System.out.println("Bit at position " + position + " of binary "
                + Integer.toBinaryString(number) + " is: " + result);
    }


    public static char getValue(int n, int k) {

        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("The position must be between 0 and 31");
        }

        int result = 1 & (n >> k);
        // or, int result = n & (1 << k);

        if (result == 0) {
            return '0';
        }

        return '1';
    }
}
