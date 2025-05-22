package org.example.algorithms_edu.algorithms_solution;

import java.util.Random;

public class FallingBallSolution {

    public static void main(String[] args) {

        int cols = 5;
        int rows = 5;
        int elevation = 5; // a cell can have the elevation 1, 2, 3, 4 or 5 (the highest)

        Random rnd = new Random();

        int[][] elevations = new int[rows][cols];

        // add random elevations
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                elevations[i][j] = 1 + rnd.nextInt(elevation);
            }
        }

        // show the grid on screen
        System.out.println("Initial grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%2s", elevations[i][j]);
            }
            System.out.println();
        }

        System.out.println("Middle cell has elevation: "
                + elevations[rows / 2][cols / 2]);
        computePath(elevations[rows / 2][cols / 2],
                rows / 2, cols / 2, rows, cols, elevations);

        System.out.println("Result grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%2s", elevations[i][j]);
            }
            System.out.println();
        }
    }

    public static void computePath(int prevElevation, int i, int j,
                                   int rows, int cols, int[][] elevations) {

        if (elevations == null) {
            throw new IllegalArgumentException("Elevations cannot be null");
        }

        // we ensure the ball is still on the grid
        if (i >= 0 && i <= (rows - 1) && j >= 0 && j <= (cols - 1)) {

            int currentElevation = elevations[i][j];
            // we check if the ball can fall from the previous cell to this cell
            if (prevElevation >= currentElevation && currentElevation > 0) {

                // we store the current elevation because we needed it for the next move
                prevElevation = currentElevation;

                // we mark this cell as visited
                elevations[i][j] = 0;

                // try to move the ball
                computePath(prevElevation, i, j - 1, rows, cols, elevations);
                computePath(prevElevation, i - 1, j, rows, cols, elevations);
                computePath(prevElevation, i, j + 1, rows, cols, elevations);
                computePath(prevElevation, i + 1, j, rows, cols, elevations);
            }
        }
    }
}
