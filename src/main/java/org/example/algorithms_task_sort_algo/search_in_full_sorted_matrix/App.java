package org.example.algorithms_task_sort_algo.search_in_full_sorted_matrix;

public class App {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 7, 8},
                {10, 16, 19, 22},
                {28, 36, 39, 53}
        };

        int elementToFind = 19;

        System.out.println("Found (" + elementToFind + "): "
                + Matrices.search(matrix, elementToFind));
    }
}
