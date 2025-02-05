package org.example.algorithms_edu.AlgorithmsLinkedList;

public class LinkedSimpleListV2App {

    public static void main(String[] args) {
        LinkedSimpleList theList = new LinkedSimpleList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(23, 6.99);
        theList.insertFirst(24, 3.99);
        theList.insertFirst(25, 10.99);
        theList.insertFirst(26, 43.99);

        theList.displayList();

        SimpleLink f = theList.find(24);
        if(f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link");

        SimpleLink d = theList.delete(25);
        if(d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link");

        theList.displayList();
    }

}
