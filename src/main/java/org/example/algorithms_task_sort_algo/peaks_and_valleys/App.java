package org.example.algorithms_task_sort_algo.peaks_and_valleys;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] integers = {4, 5, 8, 3, 2, 1, 7, 8, 5, 9};

        System.out.println("Before sorting: " + Arrays.toString(integers));
        PeaksValleys.sort(integers);
        System.out.println("After sorting: " + Arrays.toString(integers));

    }
}
