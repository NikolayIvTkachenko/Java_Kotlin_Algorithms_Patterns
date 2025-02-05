package org.example.algorithms_edu.AlgorithmsLinkedList;

public class TwoSideLink {
    public long dData;
    public TwoSideLink next;

    public TwoSideLink(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
