package org.example.algorithms_task_sort_algo.merge_two_sorted_arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // 0, 0, 0, 0, 0, 0 are spots needed for adding q in p
        int[] p = {-3, -2, 0, 3, 8, 12, 16, 17, 24, 39, 0, 0, 0, 0, 0, 0};
        int[] q = {-4, -2, -1, 1, 4, 36};

        SortArrays.merge(p, q);

        System.out.println("Result: " + Arrays.toString(p));
    }
}
