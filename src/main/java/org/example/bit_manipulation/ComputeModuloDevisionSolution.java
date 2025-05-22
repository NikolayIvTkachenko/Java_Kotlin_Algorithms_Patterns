package org.example.bit_manipulation;

public class ComputeModuloDevisionSolution {
    public static void main(String[] args) {

        // the second number must be power of 2
        System.out.println(compute(3, 4));
        System.out.println(compute(10, 8));
        System.out.println(compute(7, 8));
        System.out.println(compute(9, 4));
        System.out.println(compute(128, 16));
        System.out.println(compute(125, 16));
    }


    // 'q' must be power of 2
    public static int compute(int p, int q) {
        return p & (q - 1);
    }
}
