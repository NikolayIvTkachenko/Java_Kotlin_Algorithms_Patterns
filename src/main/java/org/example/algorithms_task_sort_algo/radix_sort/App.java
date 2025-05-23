package org.example.algorithms_task_sort_algo.radix_sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // initialize an array integers
        int[] integers = {323, 2, 33, 123, 45, 6, 788};

        System.out.println("\n\nSort via Radi sort:");
        System.out.println("-----------------------");

        RadixSort.sort(integers, 10);
        System.out.println("Sorted: " + Arrays.toString(integers));
    }
}
