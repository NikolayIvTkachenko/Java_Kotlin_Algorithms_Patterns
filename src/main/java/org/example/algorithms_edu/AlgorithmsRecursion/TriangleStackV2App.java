package org.example.algorithms_edu.AlgorithmsRecursion;

import org.example.algorithms_edu.AlgoritmsStackQueue.StackIntX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleStackV2App {
    private static int theNumber;
    private static int theAnswer;
    private static StackIntX theStack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle="+theAnswer);
    }

    public static void stackTriangle() {
        theStack = new StackIntX(10000);
        theAnswer = 0;
        while(theNumber > 0) {
            theStack.push(theNumber);
            --theNumber;
        }

        while(!theStack.isEmpty()) {
            int newN = theStack.pop();
            theAnswer += newN;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
