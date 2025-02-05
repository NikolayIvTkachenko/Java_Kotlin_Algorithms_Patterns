package org.example.algorithms_edu.AlgorithmsLinkedList;

import java.io.IOException;

public class TwoSideLinkedListApp {

    public static void main(String[] args) throws IOException {

        TwoSideLinkedList theList = new TwoSideLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(23);
        theList.insertFirst(24);

        theList.insertLast(31);
        theList.insertLast(32);
        theList.insertLast(33);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();

    }
}
