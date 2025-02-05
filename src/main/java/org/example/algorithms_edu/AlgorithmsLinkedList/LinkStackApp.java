package org.example.algorithms_edu.AlgorithmsLinkedList;

import java.io.IOException;

public class LinkStackApp {

    public static void main(String[] args) throws IOException {
        LinkStack theStack = new LinkStack();
        theStack.push(20);
        theStack.push(30);

        theStack.displayStack();

        theStack.push(40);
        theStack.push(50);

        theStack.displayStack();
        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}
