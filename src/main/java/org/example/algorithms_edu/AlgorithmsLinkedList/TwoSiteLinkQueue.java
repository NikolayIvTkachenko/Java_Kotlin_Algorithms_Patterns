package org.example.algorithms_edu.AlgorithmsLinkedList;

public class TwoSiteLinkQueue {

    private TwoSideLinkedList theList;

    public TwoSiteLinkQueue() {
        theList = new TwoSideLinkedList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(long j) {
        theList.insertLast(j);
    }

    public long remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}
