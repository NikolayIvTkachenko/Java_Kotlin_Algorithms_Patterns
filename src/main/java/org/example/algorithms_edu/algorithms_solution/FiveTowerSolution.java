package org.example.algorithms_edu.algorithms_solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FiveTowerSolution {

    public static void main(String[] args) {

        Set<Integer[]> solutions = new HashSet<>();

        buildTowers(0, new Integer[GRID_SIZE], solutions);

        System.out.println("Solutions:");
        for (Integer[] solution : solutions) {
            System.out.println(Arrays.toString(solution));
        }
    }

    protected static final int GRID_SIZE = 5; // (5x5)

    public static void buildTowers(int row, Integer[] columns, Set<Integer[]> solutions) {

        if (row < 0) {
            throw new IllegalArgumentException("The row cannot be negative");
        }

        if (columns == null || columns.length != GRID_SIZE) {
            throw new IllegalArgumentException("The columns array length must be " + GRID_SIZE);
        }

        if (solutions == null) {
            throw new IllegalArgumentException("The solutions array cannot be null");
        }

        if (row == GRID_SIZE) {
            solutions.add(columns.clone());
        } else {
            for (int col = 0; col < GRID_SIZE; col++) {

                if (canBuild(columns, row, col)) {

                    // build this tower
                    columns[row] = col;

                    // go to the next row
                    buildTowers(row + 1, columns, solutions);
                }
            }
        }
    }

    private static boolean canBuild(Integer[] columns, int nextRow, int nextColumn) {

        for (int currentRow = 0; currentRow < nextRow; currentRow++) {
            int currentColumn = columns[currentRow];

            // cannot build on the same column
            if (currentColumn == nextColumn) {
                return false;
            }

            int columnsDistance = Math.abs(currentColumn - nextColumn);
            int rowsDistance = nextRow - currentRow;

            // cannot build on the same diagonal
            if (columnsDistance == rowsDistance) {
                return false;
            }
        }

        return true;
    }
}
