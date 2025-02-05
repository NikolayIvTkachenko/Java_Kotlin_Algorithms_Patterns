package org.example.algorithms_edu.AlgorithmsLinkedList;

public class TwoSideLinkedList {
    private TwoSideLink first;
    private TwoSideLink last;

    public TwoSideLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        TwoSideLink newLink = new TwoSideLink(dd);
        if(isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        TwoSideLink newLink = new TwoSideLink(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return  temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        TwoSideLink current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}
