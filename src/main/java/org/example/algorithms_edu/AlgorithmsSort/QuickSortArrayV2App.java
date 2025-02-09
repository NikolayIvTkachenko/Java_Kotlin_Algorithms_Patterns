package org.example.algorithms_edu.AlgorithmsSort;

public class QuickSortArrayV2App {
    public static void main(String[] args) {
        int maxSize = 16;
        QuickSortArrayV2 arr;
        arr = new QuickSortArrayV2(maxSize);

        for(int j=0; j<maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        arr.quickSort();
        arr.display();
    }
}
