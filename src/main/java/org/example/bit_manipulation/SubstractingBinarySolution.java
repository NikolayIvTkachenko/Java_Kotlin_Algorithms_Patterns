package org.example.bit_manipulation;

public class SubstractingBinarySolution {


    public static void main(String[] args) {

        int q = 124;
        int p = 29;

        int result = subtract(q, p);

        System.out.println(q + "(" + Integer.toBinaryString(q) + ")" + " - "
                + p + "(" + Integer.toBinaryString(p) + ")" + " = " + result
                + "(" + Integer.toBinaryString(result) + ")");

        System.out.println();
    }

    public static int subtract(int q, int p) {

        while (p != 0) {

            // borrow is the unset bits of q AND set bits of p
            int borrow = (~q) & p;

            // subtraction of bits of q and p
            // where at least one of the bits is not set
            q = q ^ p;

            // left shift borrow by one position
            p = borrow << 1;
        }

        return q;
    }
}
