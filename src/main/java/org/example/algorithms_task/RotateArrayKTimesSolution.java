package org.example.algorithms_task;

public class RotateArrayKTimesSolution {

    public static void main(String[] args) {
        int A[] = {5, 5, 2, 3, 1, -2, 33, -1};
        int k = 5;
        System.out.println("Before: " + java.util.Arrays.toString(A));
        rightRotate(A, k);
        System.out.println("After: " + java.util.Arrays.toString(A));
    }

    public static void rightRotate(int[] m, int k) {

        int[] cm = m.clone();
        int len = m.length;

        for (int i = 0; i < len; i++) {
            m[(i + k) % len] = cm[i];
        }
    }
}
