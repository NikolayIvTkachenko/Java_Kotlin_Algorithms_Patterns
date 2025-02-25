package org.example.algorithms_edu.AlgorithmsHash;

public class HashChainSortedList {
    private HashChainLink first;

    public HashChainSortedList() {
        first = null;
    }

    public void insert(HashChainLink theLink) {
        int key = theLink.getKey();
        HashChainLink previous = null;
        HashChainLink current = first;

        while(current != null && key > current.getKey()) {
            previous = current;
            current = current.next;
        }
        if(previous==null)
            first = theLink;
        else
            previous.next = theLink;
        theLink.next = current;
    }

    public void delete(int key) {
        HashChainLink previous = null;
        HashChainLink current = first;

        while (current != null && key != current.getKey()) {
            previous = current;
            current = current.next;
        }

        if(previous==null)
            first = first.next;
        else previous.next = current.next;
    }

    public HashChainLink find(int key) {
        HashChainLink current = first;
        while(current != null && current.getKey() <= key) {
            if(current.getKey() == key)
                return current;
            current = current.next;
        }
        return null;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        HashChainLink current = first;

        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
