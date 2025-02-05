package org.example.algorithms_edu.AlgorithmsLinkedList;

public class LinkedSimpleListApp {

    public static void main(String[] args) {
        LinkedSimpleList theList = new LinkedSimpleList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(23, 6.99);
        theList.insertFirst(24, 3.99);
        theList.insertFirst(25, 10.99);
        theList.insertFirst(26, 43.99);

        theList.displayList();
        while(!theList.isEmpty()) {
            SimpleLink aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
