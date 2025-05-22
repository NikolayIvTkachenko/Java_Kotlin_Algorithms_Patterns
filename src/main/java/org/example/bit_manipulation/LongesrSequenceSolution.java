package org.example.bit_manipulation;

public class LongesrSequenceSolution {


    public static void main(String[] args) {

        int n = 67;

        int result = sequence(n);

        System.out.println("A sequence of 101 is considered 111!");
        System.out.println("The longest sequence of 1 in "
                + Integer.toBinaryString(n) + " is equal to " + result);
    }

    public static int sequence(int n) {

        if (~n == 0) {
            return Integer.SIZE; // 32
        }

        int currentSequence = 0;
        int longestSequence = 0;
        boolean flag = true;

        while (n != 0) {
            if ((n & 1) == 1) {
                currentSequence++;
                flag = false;
            } else if ((n & 1) == 0) {
                currentSequence = ((n & 0b10) == 0) // 0b10 = 2
                        ? 0 : flag
                        ? 0 : ++currentSequence;
                flag = true;
            }

            longestSequence = Math.max(currentSequence, longestSequence);

            n >>>= 1;
        }

        return longestSequence;
    }
}
