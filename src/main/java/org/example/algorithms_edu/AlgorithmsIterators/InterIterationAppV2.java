package org.example.algorithms_edu.AlgorithmsIterators;

import org.example.algorithms_edu.AlgorithmsLinkedList.Link;

import java.io.IOException;

public class InterIterationAppV2 {

    public static void main(String[] args) throws IOException {

        IteratorLinkList theList = new IteratorLinkList();
        ListIterator iter1 = theList.getListIterator();
        long value;

        iter1.insertAfter(21);
        iter1.insertAfter(40);
        iter1.insertAfter(30);
        iter1.insertAfter(7);
        iter1.insertAfter(45);

        theList.displayList();

        iter1.reset();

        Link aLink = iter1.getCurrent();
        if(aLink.dData % 3 == 0)
            iter1.deleteCurrent();

        while(!iter1.atEnd()) {
            iter1.nextLink();

            aLink = iter1.getCurrent();
            if(aLink.dData % 3 == 0)
                iter1.deleteCurrent();

        }

        theList.displayList();
    }
}
