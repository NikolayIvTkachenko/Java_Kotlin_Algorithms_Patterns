package org.example.algorithms_edu.AlgorithmsSort;

public class QuickSortArray {

    private long[] theArray;
    private int nElems;

    public QuickSortArray(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.print("A=");
        for(int j=0; j<nElems;j++)
            System.out.print(theArray[j] + " ");
        System.out.println();
    }

    public void quickSort() {
        recQuickSort(0, nElems-1);
    }

    public void recQuickSort(int left, int right) {
        if(right-left <= 0)
            return;
        else {
            long pivot = theArray[right];
            int partiotion = partitionIt(left, right, pivot);

            recQuickSort(left, partiotion-1);
            recQuickSort(partiotion+1, right);
        }
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left-1;
        int rightPtr = right;
        while(true) {
            while(theArray[++leftPtr] < pivot);
            while(rightPtr > 0 && theArray[--rightPtr] > pivot);

            if(leftPtr >= rightPtr) break;
            else swap(leftPtr, rightPtr);
        }
        swap(left, right);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
