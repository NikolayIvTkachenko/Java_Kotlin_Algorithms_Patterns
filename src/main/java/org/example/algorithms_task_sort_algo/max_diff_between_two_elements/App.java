package org.example.algorithms_task_sort_algo.max_diff_between_two_elements;

public class App {
    public static void main(String[] args) {

        int[] integers = {4, 1, 8, 3, 8, 2, 6, 7, 4, 9};

        int md = Arrays.maxDiff(integers);
        System.out.println("Max diff: " + md);
    }
}
