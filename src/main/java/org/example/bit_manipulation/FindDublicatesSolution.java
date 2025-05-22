package org.example.bit_manipulation;


import java.util.BitSet;

public class FindDublicatesSolution {

    private static final int MAX_N = 32000;

    public static void main(String[] args) {

        int[] numbers = {0, 4, 2, 3, 1, 5, 6, 2, 3, 12, 0, 4, 1};

        printDuplicates(numbers);
    }

    public static void printDuplicates(int[] arr) {

        BitSet bitArr = new BitSet(MAX_N);

        for (int i = 0; i < arr.length; i++) {

            int nr = arr[i];
            if (bitArr.get(nr)) {
                System.out.println("Duplicate: " + nr);
            } else {
                bitArr.set(nr);
            }
        }
    }

}
