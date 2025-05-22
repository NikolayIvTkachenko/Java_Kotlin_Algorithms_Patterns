package org.example.algorithms_edu.algorithms_solution;

public class RobotGridSolution {

    public static void main(String[] args) {

        // 6x6 grid
        int result1 = countPaths(6, 6);
        int result2 = countPathsBottomUp(6, 6);

        System.out.println("Number of unique paths via plain recursion: " + result1);
        System.out.println("Number of unique paths via Bottom Up: " + result2);
    }

    // Plain recursion
    public static int countPaths(int m, int n) {

        if (m <= 0 || n <= 0) {
            return -1;
        }

        // go in any cell of the first column/row is 1
        if (m == 1 || n == 1) {
            return 1;
        }

        return countPaths(m - 1, n) + countPaths(m, n - 1);
        // if diagonal movements are allowed then add: + numberOfPaths(m-1, n-1);
    }

    // Memoization
    public static int countPathsBottomUp(int m, int n) {

        if (m <= 1 || n <= 1) {
            return -1;
        }

        // cache the results of subproblems
        int[][] count = new int[m][n];

        // go in any cell of the first row is 1
        for (int j = 0; j < n; j++) {
            count[0][j] = 1;
        }

        // go in any cell of the first column is 1
        for (int i = 0; i < m; i++) {
            count[i][0] = 1;
        }

        // determine the paths for other cells in bottom-up manner
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                count[i][j] = count[i - 1][j] + count[i][j - 1];
                // if diagonal movements are allowed then add: + count[i-1][j-1];
            }
        }

        return count[m - 1][n - 1];
    }
}
