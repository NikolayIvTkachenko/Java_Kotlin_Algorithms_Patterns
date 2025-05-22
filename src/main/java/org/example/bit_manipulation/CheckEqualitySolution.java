package org.example.bit_manipulation;

public class CheckEqualitySolution {


    public static void main(String[] args) {

        System.out.println("(2 equal 4) -> " + checkEquality(2, 4));
        System.out.println("(67 equal 66) -> " + checkEquality(67, 66));
        System.out.println("(0 equal 0) -> " + checkEquality(0, 0));
        System.out.println("(-2 equal -4) -> " + checkEquality(-2, -4));
        System.out.println("(-2 equal -2) -> " + checkEquality(-2, -2));
        System.out.println("(12 equal 12) -> " + checkEquality(12, 12));
    }

    public static boolean checkEquality(int p, int q) {

        return ((p ^ q) == 0);
    }
}
