package org.example.bit_manipulation;

public class MultipleBinariesSolution {

    public static void main(String[] args) {

        int q = 124;
        int p = 29;

        int result = multiply(q, p);

        System.out.println(q + "(" + Integer.toBinaryString(q) + ")" + " * "
                + p + "(" + Integer.toBinaryString(p) + ")" + " = " + result
                + "(" + Integer.toBinaryString(result) + ")");
    }

    public static int multiply(int q, int p) {

        int result = 0;

        while (p != 0) {

            // we compute the value of q only when the LSB of p is 1
            if ((p & 1) != 0) {
                result = result + q;
            }

            q = q << 1;  // q is left shifted with one position
            p = p >>> 1; // p is logical right shifted with one position
        }

        return result;
    }
}
