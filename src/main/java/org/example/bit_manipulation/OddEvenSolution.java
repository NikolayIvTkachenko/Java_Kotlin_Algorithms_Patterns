package org.example.bit_manipulation;

public class OddEvenSolution {

    public static void main(String[] args) {

        System.out.println("2 -> " + isOdd(2));
        System.out.println("3 -> " + isOdd(3));
        System.out.println("4 -> " + isOdd(4));
        System.out.println("5 -> " + isOdd(5));
        System.out.println("6 -> " + isOdd(6));
        System.out.println("7 -> " + isOdd(7));
        System.out.println("8 -> " + isOdd(8));
        System.out.println("9 -> " + isOdd(9));
        System.out.println("10 -> " + isOdd(10));
        System.out.println("12453 -> " + isOdd(12453));
        System.out.println("12988 -> " + isOdd(12988));
    }

    public static boolean isOdd(int p) {

        return ((p & 1) != 0);
    }

}
