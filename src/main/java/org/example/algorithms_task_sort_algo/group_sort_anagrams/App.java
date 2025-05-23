package org.example.algorithms_task_sort_algo.group_sort_anagrams;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String[] words = {
                "calipers", "caret", "slat", "cater", "thickset", "spiracle", "trace",
                "last", "salt", "bowel", "crate", "loop", "polo", "thickest",
                "below", "thickets", "pool", "elbow", "replicas"
        };

        Anagrams anagrams = new Anagrams();

        System.out.println("\n\nVia hashing (O(nm log m)): ");
        anagrams.printAnagrams(words);

        System.out.println("\n\nVia hashing (O(nm)): ");
        anagrams.printAnagramsOptimized(words);

        System.out.println("\n\nVia Comparator (O(nm log m)): ");
        Arrays.sort(words, new Anagrams());
        System.out.println(Arrays.toString(words));
    }
}
