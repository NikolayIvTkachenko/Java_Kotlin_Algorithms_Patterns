package org.example.algorithms_task;

public class MaximumInCircularArraySolution {

    public static void main(String[] args) {

        int[] m = {7, 11, 12, 13, 15, -4, -3, -2, 0, 1, 1, 3, 4, 7, 7};

        int max = findMax(m);

        System.out.println("Array: " + java.util.Arrays.toString(m));
        System.out.println("Max value is: " + max);
    }

    public static int findMax(int[] m) {

        if (m == null || m.length == 0) {
            return -1;
        }

        int left = 0;
        int right = m.length - 1;

        while ((left + 1) < right) {

            int middle = left + (right - left) / 2;

            if (m[middle] == m[left]) {
                left = middle;  // going backward
            } else if (m[middle] < m[left]) {
                right = middle;
            } else {
                left = middle;
            }
        }

        if (m[right] >= m[left]) {
            return m[right];
        } else {
            return m[left];
        }
    }
}
