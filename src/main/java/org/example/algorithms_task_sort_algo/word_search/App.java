package org.example.algorithms_task_sort_algo.word_search;

public class App {
    public static void main(String[] args) {

        char[][] board
                = {
                {'T', 'A', 'C'},
                {'A', 'B', 'L'},
                {'X', 'I', 'E'}
        };

        boolean resultTable = Words.exist(board, "TABLE");
        boolean resultTaxi = Words.exist(board, "TAXI");

        System.out.println("Found 'TABLE'? " + resultTable);
        System.out.println("Found 'TAXI'? " + resultTaxi);
    }
}
