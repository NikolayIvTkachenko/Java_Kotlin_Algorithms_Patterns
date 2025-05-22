package org.example.algorithms_task;

public class MinimumInCircularArraySolution {

    public static void main(String[] args) {

        int[] m = {7, 11, 12, 13, 15, -4, -3, -2, 0, 1, 1, 3, 4, 7, 7};

        int min = findMin(m);

        System.out.println("Array: " + java.util.Arrays.toString(m));
        System.out.println("Min value is: " + min);
    }

    public static int findMin(int[] m) {

        if (m == null || m.length == 0) {
            return -1;
        }

        int left = 0;
        int right = m.length - 1;

        while ((left + 1) < right) {

            int middle = left + (right - left) / 2;

            if (m[middle] == m[right]) {
                right--; // for duplicates
            } else if (m[middle] > m[right]) {
                left = middle;
            } else {
                right = middle;
            }
        }

        if (m[left] <= m[right]) {
            return m[left];
        }

        return m[right];
    }
}
