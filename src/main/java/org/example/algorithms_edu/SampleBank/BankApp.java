package org.example.algorithms_edu.SampleBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApp {
    public static void main(String[] args) throws IOException {

        BankAccount bal = new BankAccount(100.00);
        System.out.println("Before transactions. ");
        bal.display();

        bal.deposit(74.35);
        bal.withdraw(20.00);

        System.out.println("After transactions. ");
        bal.display();

        String result = getString();
        System.out.println(result);
    }


    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();

        return str;
    }

}
