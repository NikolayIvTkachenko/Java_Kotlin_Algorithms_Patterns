package org.example.algorithms_edu.AlgorithmsSort;

public class ArrayInsert {

    private long[] a;
    private int nElems;

    public ArrayInsert(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void insertionSort() {

        int in, out;
        for(out=1; out<nElems; out++) { //out - разделеительный маркер
            long temp = a[out];
            in = out;
            while(in>0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
