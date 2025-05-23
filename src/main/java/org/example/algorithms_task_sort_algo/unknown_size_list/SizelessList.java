package org.example.algorithms_task_sort_algo.unknown_size_list;

public class SizelessList {

    private final int[] arr;

    public SizelessList(int[] arr) {
        this.arr = arr.clone();
    }

    public int peekAt(int index) {
        if (index >= arr.length) {
            return -1;
        }

        return arr[index];
    }
}