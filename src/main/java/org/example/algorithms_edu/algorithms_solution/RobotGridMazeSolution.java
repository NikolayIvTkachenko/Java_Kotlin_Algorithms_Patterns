package org.example.algorithms_edu.algorithms_solution;


import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RobotGridMazeSolution {

    public static void main(String[] args) {

        /* 0 - robot, # - maze, X - target
 (m, n) +           +
        |0| | | | | |
        |0|0| | | | |
        |#|0|0|0|0| |
        |#|#|#|#|0| |
        | | | | |0| |
        | | | | |0|X|
        +           + (0, 0)
        */

        // we store the path in a LinkedHashSet
        Set<Point> path = new LinkedHashSet<>();

        // we define the maze
        boolean[][] maze  = new boolean[6][6];
        maze[2][0]=true;
        maze[3][0]=true;
        maze[3][1]=true;
        maze[3][2]=true;
        maze[3][3]=true;

        // we compute and display the path
        computePath(5, 5, maze, path);

        System.out.println("Computed path (plain recursion):");
        path.forEach(System.out::println);

        // we define a Set for storing the visited cells
        Set<Point> visited = new HashSet<>();

        // we compute and display the path
        computePath(5, 5, maze, path, visited);

        System.out.println("\nComputed path (Memoization):");
        path.forEach(System.out::println);
    }

    // Plain recursion
    // we go recursively from [m, n] (top-left corner) and try to reach [0, 0] (bottom-right corner)
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path) {

        if (path == null || maze == null) {
            throw new IllegalArgumentException("Path and maze cannot be null");
        }

        // we fell off the grid so we return
        if (m < 0 || n < 0) {
            return false;
        }

        // we cannot step at this cell
        if (maze[m][n]) {
            return false;
        }

        if (((m == 0) && (n == 0)) // we reached the target (this is the bottom-right corner)
                || computePath(m, n - 1, maze, path) // try to go to the right
                || computePath(m - 1, n, maze, path)) { // try to go to down

            // we add the cell to the path
            path.add(new Point(m, n));

            return true;
        }

        return false;
    }

    // Memoization
    // we go recursively from [m, n](top-left corner) and try to reach [0, 0] (bottom-right corner)
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path, Set<Point> visitFailed) {

        if (path == null || maze ==null || visitFailed == null) {
            throw new IllegalArgumentException("Path, maze and visitFailed cannot be null");
        }

        // we fell off the grid so we return
        if (m < 0 || n < 0) {
            return false;
        }

        // we cannot step at this cell
        if (maze[m][n]) {
            return false;
        }

        Point cell = new Point(m, n);

        // Check if we've already visited this cell
        if (visitFailed.contains(cell)) {
            return false;
        }

        if (((m == 0) && (n == 0)) // we reached the target (this is the bottom-right corner)
                || computePath(m, n - 1, maze, path, visitFailed) // try to go to the right
                || computePath(m - 1, n, maze, path, visitFailed)) { // try to go to down

            // we add the cell to the path
            path.add(cell);

            return true;
        }

        visitFailed.add(cell);
        return false;
    }
}
