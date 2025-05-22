package org.example.bit_manipulation;

public class SwapOddEvenSolution {

    public static void main(String[] args) {

        int number = 663;

        int result = swap(number);

        System.out.println("Initial:\t\t" + Integer.toBinaryString(number));
        System.out.println("Swapped:\t\t" + Integer.toBinaryString(result));
    }


    public static int swap(int n) {
        if (n < 0) {
            return -1;
        }
        int moveToEvenPositions = (n & 0b10101010101010101010101010101010) >>> 1;
        int moveToOddPositions = (n & 0b1010101010101010101010101010101) << 1;
        return moveToEvenPositions | moveToOddPositions;
    }
}
