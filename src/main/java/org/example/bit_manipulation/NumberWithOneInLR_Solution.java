package org.example.bit_manipulation;

public class NumberWithOneInLR_Solution {

    public static void main(String[] args) {

        int left = 3;
        int right = 7;

        int result = setBetween(left, right);
        System.out.println("Result: " + result
                + "(" + Integer.toBinaryString(result) + ")");
    }

    public static int setBetween(int left, int right) {
        return (1 << (right + 1)) - (1 << left);
    }
}
