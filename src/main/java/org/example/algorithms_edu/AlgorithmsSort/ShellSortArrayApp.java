package org.example.algorithms_edu.AlgorithmsSort;

public class ShellSortArrayApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ShellSortArray arr;
        arr = new ShellSortArray(maxSize);

        for(int j=0; j<maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.shellSort();
        arr.display();
    }
}
