package org.example.oop.aggregation;

public class App {
    public static void main(String[] args) {

        Racket racket = new Racket("Babolat Pure Aero", 100, 300);
        TennisPlayer player = new TennisPlayer("Rafael Nadal", racket);

        System.out.println("Player " + player.getName()
                + " plays with " + player.getRacket().getType());
    }
}
