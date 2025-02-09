package org.example.algorithms_edu.AlgorithmsSort;

public class QuickSortArrayV3App {

    public static void main(String[] args) {
        int maxSize = 16;
        QuickSortArrayV3 arr;
        arr = new QuickSortArrayV3(maxSize);

        for(int j=0; j<maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        arr.quickSort();
        arr.display();
    }

}
