package org.example.bit_manipulation;

public class SetBitValueSolution {

    public static void main(String[] args) {

        int number = 423;
        int position = 7;

        int result0 = setValueTo0(number, position);

        System.out.println("\nSetting bit on position " + position + " to 0:");
        System.out.println("Number: " + number + "(" + Integer.toBinaryString(number) + ")");
        System.out.println("Result: " + result0 + "(" + Integer.toBinaryString(result0) + ")");

        int result1 = setValueTo1(result0, position);

        System.out.println("\nSetting bit  on position " + position + " to 1:");
        System.out.println("Number: " + result0 + "(" + Integer.toBinaryString(result0) + ")");
        System.out.println("Result: " + result1 + "(" + Integer.toBinaryString(result1) + ")");
    }

    public static int setValueTo1(int n, int k) {
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("The position must be between 0 and 31");
        }
        return n | (1 << k);
    }

    public static int setValueTo0(int n, int k) {
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("The position must be between 0 and 31");
        }
        return n & ~(1 << k);
    }

}
