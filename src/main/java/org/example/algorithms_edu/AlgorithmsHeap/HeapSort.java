package org.example.algorithms_edu.AlgorithmsHeap;

public class HeapSort {
    private HeapNode[] heapArray;
    private int maxSize;
    private int currentSize;

    public HeapSort(int mx) {
        maxSize = mx;
        currentSize = 0;
        heapArray = new HeapNode[maxSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void trickleDown(int index) {
        int largerChild;
        HeapNode top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].geyKey() < heapArray[rightChild].geyKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }

            if (top.geyKey() >= heapArray[largerChild].geyKey())
                break;
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayHeap() {
        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "...................................................................";
        System.out.println(dots + dots);
        while (currentSize > 0) {
            if (column == 0)
                for (int k = 0; k < nBlanks; k++)
                    System.out.print(' ');
            System.out.print(heapArray[j].geyKey());
            if (++j == currentSize)
                break;

            if (++column == itemsPerRow) {
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else {
                for (int k = 0; k < nBlanks * 2 - 2; k++)
                    System.out.print(' ');
            }
        }
        System.out.println("\n"+dots+dots);
    }

    public void displayArray() {
        for(int j=0; j<maxSize; j++)
            System.out.print(heapArray[j].geyKey() + " ");
        System.out.println("");
    }

    public HeapNode remove() {
        HeapNode root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void insertAt(int index, HeapNode newNode) {
        heapArray[index] = newNode;
    }

    public void incrementSize() {
        currentSize++;
    }
}
