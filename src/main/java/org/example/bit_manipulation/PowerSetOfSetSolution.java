package org.example.bit_manipulation;


import java.util.HashSet;
import java.util.Set;

public class PowerSetOfSetSolution {

    public static void main(String[] args) {

        char[] set = {'a', 'b', 'c'};

        Set<Set<Character>> subsets = powerSet(set);

        System.out.println("Result: " + subsets);
    }

    public static Set<Set<Character>> powerSet(char[] set) {

        if (set == null) {
            throw new IllegalArgumentException("The given set cannot be null");
        }

        // total number of subsets (2^n)
        long subsetsNo = (long) Math.pow(2, set.length);

        // store subsets
        Set<Set<Character>> subsets = new HashSet<>();

        // generate each subset one by one
        for (int i = 0; i < subsetsNo; i++) {
            Set<Character> subset = new HashSet<>();

            // check every bit of i
            for (int j = 0; j < set.length; j++) {
                // if j'th bit of i is set, add set[j] to the current subset
                if ((i & (1 << j)) != 0) {
                    subset.add(set[j]);
                }
            }

            subsets.add(subset);
        }

        return subsets;
    }
}
