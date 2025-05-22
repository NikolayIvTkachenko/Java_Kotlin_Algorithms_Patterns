package org.example.algorithms_task;

public class CountDistinctAbsoluteSortedArraySolution {

    public static void main(String[] args) {

        int[] m = {-3, -3, -2, -1, -1, -1, 0, 1, 1, 1, 2, 2, 3, 5, 6, 7, 7};

        int result = findAbsoluteDistinct(m);

        System.out.println("Array: " + java.util.Arrays.toString(m));
        System.out.print("The number of distinct absolute values is: "
                + result);
    }

    public static int findAbsoluteDistinct(int[] m) {

        if (m == null) {
            return -1;
        }

        int count = m.length;

        int left = 0;
        int right = m.length - 1;

        while (left < right) {

            // remove duplicates elements from the left and right
            while (left < right && m[left] == m[left + 1]) {
                count--;
                left++;
            }

            while (right > left && m[right] == m[right - 1]) {
                count--;
                right--;
            }

            // only one element is left
            if (left == right) {
                break;
            }

            int sum = m[left] + m[right];

            // decrease the distinct count if zero sum pair is encountered
            if (sum == 0) {

                count--;

                left++;
                right--;
            } else if (sum < 0) {

                left++;
            } else {

                right--;
            }
        }

        return count;
    }
}
