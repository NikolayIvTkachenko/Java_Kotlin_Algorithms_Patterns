package org.example.algorithms_edu.AlgorithmsSort;

public class QuickSortArrayApp {

    public static void main(String[] args) {
        int maxSize = 16;
        QuickSortArray arr;
        arr = new QuickSortArray(maxSize);

        for(int j=0; j<maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        arr.quickSort();
        arr.display();
    }

}
