package org.example.algorithms_edu.AlgorithmsRecursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleStackApp {

    private static int codePart;
    private static TriangleParams theseParams;
    private static TriangleStackX theStack;
    private static int theAnswer;
    private static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        recTriangle();
        System.out.println("Triangle="+theAnswer);
    }

    public static void recTriangle() {
        theStack = new TriangleStackX(10000);
        codePart = 1;
        while(step() == false);
    }

    public static boolean step() {
        switch (codePart){
            case 1:
                theseParams = new TriangleParams(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:
                theseParams = theStack.peek();
                if(theseParams.n == 1) {
                    theAnswer = 1;
                    codePart = 5;
                } else {
                    codePart = 3;
                }
                break;
            case 3:
                TriangleParams newParams = new TriangleParams(theseParams.n -1, 4);
                theStack.push(newParams);
                codePart = 2;
                break;
            case 4:
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5:
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;
        }
        return false;
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
