package org.example.algorithms_edu.AlgorithmsIterators;

import org.example.algorithms_edu.AlgorithmsLinkedList.Link;

public class IteratorLinkList {

    private Link first;

    public IteratorLinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return first==null;
    }

    public ListIterator getListIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
