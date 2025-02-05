package org.example.algorithms_edu.AlgorithmsLinkedList;

public class LinkStack {

    private LinkList theLink;

    public LinkStack() {
        theLink = new LinkList();
    }

    public void push(long j) {
        theLink.insertFirst(j);
    }

    public long pop() {
        return theLink.deleteFirst();
    }

    public boolean isEmpty() {
        return (theLink.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theLink.displayList();
    }

}
