package org.example.algorithms_edu.AlgorithmsLinkedList;

public class LinkedSimpleList {
    private SimpleLink first;

    public LinkedSimpleList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        SimpleLink newSimpleLink = new SimpleLink(id, dd);
        newSimpleLink.next = first;
        first = newSimpleLink;
    }

    public SimpleLink deleteFirst() {
        SimpleLink temp = first;
        first = first.next;
        return temp;
    }

    public SimpleLink find(int key) {
        SimpleLink current = first;
        while(current.iData != key) {
            if(current.next == null)
                return null;
            else
                current = current.next;

        }
        return current;
    }

    public SimpleLink delete(int key) {
        SimpleLink current = first;
        SimpleLink previous = first;

        while(current.iData != key) {
            if(current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        SimpleLink current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
