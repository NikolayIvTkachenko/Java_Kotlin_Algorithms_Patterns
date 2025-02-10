package org.example.algorithms_edu.AlgorithmsHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSortApp {

    public static void main(String[] args) throws IOException {
        int size, j;
        System.out.print("Enter number of items: ");
        size = getInt();
        HeapSort theHeap = new HeapSort(size);

        for(j=0; j<size; j++) {
            int random = (int) (Math.random()*100);
            HeapNode newNode = new HeapNode(random);
            theHeap.insertAt(j, newNode);
            theHeap.incrementSize();
        }
        System.out.println("Random: ");
        theHeap.displayArray(); //Вывод случайного массива

        for(j=size/2-1; j>=0; j--)
            theHeap.trickleDown(j); //Преобразование массива в пирамиду

        System.out.println("Heap: ");
        theHeap.displayArray();
        theHeap.displayHeap();

        //Извлечение из кучи с сохранение в конце массива
        for(j=size-1; j>=0; j--) {
            HeapNode biggestNode = theHeap.remove();
            theHeap.insertAt(j, biggestNode);
        }

        System.out.println("Sorted: ");
        theHeap.displayArray();
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
}
