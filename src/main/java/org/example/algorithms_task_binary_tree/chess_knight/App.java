package org.example.algorithms_task_binary_tree.chess_knight;

public class App {
    public static void main(String[] args) {

        ChessKnight ck = new ChessKnight();

        int movesNr = ck.countknightMoves(0, 7, 7, 0, 8);

        System.out.println("Minimum number of needed moves: " + movesNr);
    }
}
