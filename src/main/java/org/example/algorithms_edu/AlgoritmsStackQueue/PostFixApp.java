package org.example.algorithms_edu.AlgoritmsStackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostFixApp {

    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while(true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();

            if(input.equals(""))
                break;

            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluates to " +output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

}
//3*(4+5)-6/(1+2)
//345+*612+/-
