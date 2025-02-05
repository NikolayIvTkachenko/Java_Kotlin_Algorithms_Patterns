package org.example.algorithms_edu.AlgorithmsLinkedList;

public class SimpleLink {
    public int iData;
    public double dData;
    public SimpleLink next;

    public SimpleLink(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        System.out.println("{" + iData +". " + dData + '}');
    }
}
