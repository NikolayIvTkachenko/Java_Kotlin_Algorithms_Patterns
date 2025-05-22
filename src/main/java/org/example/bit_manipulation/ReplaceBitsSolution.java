package org.example.bit_manipulation;

public class ReplaceBitsSolution {

    private static final int Q = 4914;
    private static final int P = 63;
    private static final int I = 4;
    private static final int J = 9;

    public static void main(String[] args) {

        System.out.println("Q (in Q, we replace the bits between positions " + I + " to " + J + "): "
                + Integer.toString(Q, 2) + "(" + Q + ")");
        System.out.println("P (new bits that will be inserted in positions " + I + " to " + J + "): "
                + Integer.toString(P, 2) + "(" + P + ")");

        System.out.println();

        int result = replace(Q, P, I, J);

        System.out.println("Result: " + Integer.toString(result, 2));
    }

    public static int replace(int q, int p, int i, int j) {

        if (q < 0 || p < 0) {
            throw new IllegalArgumentException("The q and p numbers must be positive");
        }

        if (i < 0 || j < 0 || i > 31 || j > 31 || i >= j) {
            throw new IllegalArgumentException("The i and j values don't follow the problem instructions");
        }

        int ones = ~0; // 11111111 11111111 11111111 11111111

        int leftShiftJ = ones << (j + 1);
        int leftShiftI = ((1 << i) - 1);

        int mask = leftShiftJ | leftShiftI;

        int applyMaskToQ = q & mask;
        int bringPInPlace = p << i;

        return applyMaskToQ | bringPInPlace;
    }
}
