package org.example.algorithms_task;


import java.util.Map;
import java.util.TreeMap;

public class ReplaceElementWithRankSolution {


    public static void main(String[] args) {

        // no duplicates allowed
        int[] m = {7, 11, -5, 13, 15, -4, -3, -2, 0, 14, 3, 42};

        System.out.println("Before: " + java.util.Arrays.toString(m));

        replace(m);

        System.out.println("After: " + java.util.Arrays.toString(m));
    }

    public static void replace(int[] m) {

        if (m == null) {
            throw new IllegalArgumentException("The given array cannot be null");
        }

        Map<Integer, Integer> treemap = new TreeMap<>();

        // store (element, index)
        for (int i = 0; i < m.length; i++) {
            treemap.put(m[i], i);
        }

        // rank starts from 1
        int rank = 1;

        // iterate through the map and replace each element by its rank
        for (Map.Entry<Integer, Integer> entry : treemap.entrySet()) {
            m[entry.getValue()] = rank++;
        }
    }
}
