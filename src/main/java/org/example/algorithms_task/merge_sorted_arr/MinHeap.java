package org.example.algorithms_task.merge_sorted_arr;

public class MinHeap {

    int data;
    int heapIndex;
    int currentIndex;

    public MinHeap(int data, int heapIndex, int currentIndex) {
        this.data = data;
        this.heapIndex = heapIndex;
        this.currentIndex = currentIndex;
    }

    @Override
    public String toString() {
        return data+"";
    }
}
