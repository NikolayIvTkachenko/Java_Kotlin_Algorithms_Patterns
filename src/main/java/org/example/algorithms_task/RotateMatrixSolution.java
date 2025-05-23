package org.example.algorithms_task;

public class RotateMatrixSolution {

    public static void main(String[] args) {

        int s = 5;

        // three identical matrix
        int[][] m1 = new int[s][s]; // used to call rotateInNew()
        int[][] m2 = new int[s][s]; // used to call rotateWithTranspose()
        int[][] m3 = new int[s][s]; // used to call rotateRing()

        // initialize matrix with number 0, 1, 2, ... ,(s-1)
        int v = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                m1[i][j] = ++v;
                m2[i][j] = m1[i][j];
                m3[i][j] = m1[i][j];
            }
        }

        System.out.println("Initial matrix:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.format("%4s", m1[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int[][] result = rotateInNew(m1);
        System.out.println("Rotated counterclockwise by 90 degrees via new matrix:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.format("%4s", result[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        rotateWithTranspose(m2);
        System.out.println("Rotated counterclockwise by 90 degrees via transpose:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.format("%4s", m2[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        rotateRing(m3);
        System.out.println("Rotated counterclockwise by 90 degrees ring by ring:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.format("%4s", m3[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateInNew(int[][] m) {

        if (m == null || m.length == 0) {
            throw new IllegalArgumentException("The given matrix cannot be null or empty");
        }

        if (m.length != m[0].length) {
            throw new IllegalArgumentException("The given matrix must be of type nxn");
        }

        int r[][] = new int[m.length][m.length];

        int offset = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                r[offset - j][i] = m[i][j];
            }
        }

        return r;
    }

    // rotate the given matrix in time complexity of O(n2)
    // and space complexity of O(1)
    public static boolean rotateWithTranspose(int m[][]) {

        if (m == null || m.length == 0) {
            throw new IllegalArgumentException("The given matrix cannot be null or empty");
        }

        if (m.length != m[0].length) {
            throw new IllegalArgumentException("The given matrix must be of type nxn");
        }

        transpose(m);

        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0, k = m[0].length - 1; j < k; j++, k--) {
                int temp = m[j][i];
                m[j][i] = m[k][i];
                m[k][i] = temp;
            }
        }

        return true;
    }

    // Transpose of matrix
    private static void transpose(int m[][]) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int temp = m[j][i];
                m[j][i] = m[i][j];
                m[i][j] = temp;
            }
        }
    }

    // rotate ring by ring
    // rotate the given matrix in time complexity of O(n2)
    // and space complexity of O(1)
    public static boolean rotateRing(int[][] m) {

        if (m == null || m.length == 0) {
            throw new IllegalArgumentException("The given matrix cannot be null or empty");
        }

        if (m.length != m[0].length) {
            throw new IllegalArgumentException("The given matrix must be of type nxn");
        }

        int len = m.length;

        // rotate counterclockwise
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {

                int temp = m[i][j];

                // right -> top
                m[i][j] = m[j][len - 1 - i];

                // bottom -> right
                m[j][len - 1 - i] = m[len - 1 - i][len - 1 - j];

                // left -> bottom
                m[len - 1 - i][len - 1 - j] = m[len - 1 - j][i];

                // top -> left
                m[len - 1 - j][i] = temp;
            }
        }

        // rotate clockwise
        /*
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - 1 - i; j++) {

                int temp = m[i][j];

                // left -> top
                m[i][j] = m[len - 1 - j][i];

                // bottom -> left
                m[len - 1 - j][i] = m[len - 1 - i][len - 1 - j];

                // right -> bottom
                m[len - 1 - i][len - 1 - j] = m[j][len - 1 - i];

                // top -> right
                m[j][len - 1 - i] = temp;
            }
        }
        */

        return true;
    }
}
