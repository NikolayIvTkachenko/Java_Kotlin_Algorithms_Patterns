package org.example.algorithms_edu.AlgoritmsStackQueue;

public class StackIntApp {

    public static void main(String[] args) {
        StackIntX theStack = new StackIntX(10);

        theStack.push(20);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        theStack.push(70);

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
