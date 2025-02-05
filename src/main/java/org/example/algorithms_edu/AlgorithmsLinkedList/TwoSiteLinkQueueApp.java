package org.example.algorithms_edu.AlgorithmsLinkedList;

public class TwoSiteLinkQueueApp {
    public static void main(String[] args) {
        TwoSiteLinkQueue theQueue = new TwoSiteLinkQueue();

        theQueue.insert(20);
        theQueue.insert(30);

        theQueue.displayQueue();

        theQueue.insert(40);
        theQueue.insert(50);

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayQueue();

    }
}
