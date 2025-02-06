package org.example.algorithms_edu.AlgorithmsRecursion;

import org.example.algorithms_edu.AlgoritmsStackQueue.ParsePost;

public class TriangleStackX {
    private int maxSize;
    private TriangleParams[] stackArray;
    private int top;

    public TriangleStackX(int s) {
        maxSize = s;
        stackArray = new TriangleParams[maxSize];
        top = -1;
    }

    public void push(TriangleParams p) {
        stackArray[++top] = p;
    }

    public TriangleParams pop() {
        return stackArray[top--];
    }

    public TriangleParams peek() {
        return stackArray[top];
    }
}
