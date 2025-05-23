package org.example.algorithms_task_sort_algo.position_of_first_one;

public class App {
    public static void main(String[] args) {

        int[] zerosAndOnes = {0, 0, 1, 1, 1, 1, 1};

        int index = Arrays.firstOneIndex(zerosAndOnes);
        System.out.println("Index: " + index);
    }
}
