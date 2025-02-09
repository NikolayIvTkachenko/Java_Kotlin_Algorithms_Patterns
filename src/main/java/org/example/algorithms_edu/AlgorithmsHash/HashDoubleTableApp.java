package org.example.algorithms_edu.AlgorithmsHash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashDoubleTableApp {
    public static void main(String[] args) throws IOException {
        HashDataItem aDataItem;
        int aKey, size, n;

        System.out.println("Enter size of hash table: ");
        size = getInt();

        System.out.println("Enter initial number of items: ");
        n = getInt();

        HashHashTableV2 theHashTable = new HashHashTableV2(size);

        for(int j=0; j<n; j++) {
            aKey = (int)(Math.random() * 2 * size);
            aDataItem = new HashDataItem(aKey);
            theHashTable.insert(aKey, aDataItem);
        }
        while(true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete or find: ");

            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new HashDataItem(aKey);
                    theHashTable.insert(aKey, aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if(aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }
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

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
}
