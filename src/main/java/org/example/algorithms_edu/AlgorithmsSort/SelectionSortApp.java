package org.example.algorithms_edu.AlgorithmsSort;

public class SelectionSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelection arr;
        arr = new ArraySelection(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.selectionSort();

        arr.display();

    }
}
