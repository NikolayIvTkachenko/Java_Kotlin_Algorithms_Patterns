package org.example.algorithms_edu.AlgorithmsLinkedList;

public class DoublyLinkListApp {

    public static void main(String[] args) {
        DoublyLinkList theList = new DoublyLinkList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertFirst(11);
        theList.insertFirst(33);
        theList.insertFirst(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);

        theList.displayForward();

        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);

        theList.displayForward();
    }
}
