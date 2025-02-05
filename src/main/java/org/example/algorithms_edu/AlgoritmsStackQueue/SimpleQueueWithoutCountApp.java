package org.example.algorithms_edu.AlgoritmsStackQueue;

public class SimpleQueueWithoutCountApp {
    public static void main(String[] args) {

        SimpleQueueWithoutCount theQueue = new SimpleQueueWithoutCount(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        System.out.println("==>");
        System.out.println(theQueue.size());
        System.out.println(theQueue.isEmpty());
        System.out.println(theQueue.isFull());
        System.out.println("==>");

        while(!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("--- END ---");
    }
}
