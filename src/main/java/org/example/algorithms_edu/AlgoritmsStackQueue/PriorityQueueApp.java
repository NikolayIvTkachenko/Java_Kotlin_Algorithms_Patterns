package org.example.algorithms_edu.AlgoritmsStackQueue;

import java.io.IOException;

public class PriorityQueueApp {
    public static void main(String[] args) throws IOException {

        PriorityQueue thePQ = new PriorityQueue(5);

        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);


        while(!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
