package org.example.bit_manipulation;

public class SwapTwoIntegerSolution {

    public static void main(String[] args) {

        swap(2, 4);
        swap(-2, 4);
        swap(0, 1);
        swap(42, 11);
    }

    public static void swap(int p, int q) {
        System.out.println();
        System.out.println("Before swap: p=" + p + ", q=" + q);
        p = p ^ q ^ (q = p);
        System.out.println("After swap: p=" + p + ", q=" + q);
    }
}
