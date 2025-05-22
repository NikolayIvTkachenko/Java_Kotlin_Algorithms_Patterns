package org.example.algorithms_task;

public class MatrixWithZerosSolution {

    public static void main(String[] args) {

        int r = 5;
        int c = 8;

        // three identical matrix
        int[][] m = new int[r][c];

        // initialize matrix with number 0, 1, 2, ... ,(s-1)
        int v = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (Math.random() < 0.95d) {
                    m[i][j] = ++v;
                } else {
                    m[i][j] = 0;
                }
            }
        }

        System.out.println("Initial matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("%4s", m[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        alignZeros(m);

        System.out.println("Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("%4s", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void alignZeros(int[][] m) {

        if (m == null || m.length == 0) {
            throw new IllegalArgumentException("The given matrix cannot be null or empty");
        }

        boolean firstRowHasZeros = false;
        boolean firstColumnHasZeros = false;

        // Search at least a zero on first row
        for (int j = 0; j < m[0].length; j++) {
            if (m[0][j] == 0) {
                firstRowHasZeros = true;
                break;
            }
        }

        // Search at least a zero on first column
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == 0) {
                firstColumnHasZeros = true;
                break;
            }
        }

        // Search all zeros in the rest of the matrix
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[0].length; j++) {
                if (m[i][j] == 0) {
                    m[i][0] = 0;
                    m[0][j] = 0;
                }
            }
        }

        // Loop the first column and propagate each found zero on the row
        for (int i = 1; i < m.length; i++) {
            if (m[i][0] == 0) {
                setRowOfZero(m, i);
            }
        }

        // Loop the first row and propagate each found zero on the column
        for (int j = 1; j < m[0].length; j++) {
            if (m[0][j] == 0) {
                setColumnOfZero(m, j);
            }
        }

        // If the first row has at least one 0 then set the entire row to 0
        if (firstRowHasZeros) {
            setRowOfZero(m, 0);
        }

        // If the first column has at least one 0 then set the entire column to 0
        if (firstColumnHasZeros) {
            setColumnOfZero(m, 0);
        }

    }

    private static void setRowOfZero(int[][] m, int r) {
        for (int j = 0; j < m[0].length; j++) {
            m[r][j] = 0;
        }
    }

    private static void setColumnOfZero(int[][] m, int c) {
        for (int i = 0; i < m.length; i++) {
            m[i][c] = 0;
        }
    }
}
