package org.example.bit_manipulation;

public class PositionOfFirstBitOfOneSolution {


    public static void main(String[] args) {

        int number = 4;

        System.out.println("Result: " + findPosition(number));
    }

    public static int findPosition(int n) {

        int count = 0;

        if(!isPowerOfTwo(n)) {
            return -1;
        }

        while (n != 0) {
            n = n >> 1;
            ++count;
        }

        return count;
    }

    private static boolean isPowerOfTwo(int n) {

        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
