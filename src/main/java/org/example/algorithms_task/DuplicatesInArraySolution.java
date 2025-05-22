package org.example.algorithms_task;



import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class DuplicatesInArraySolution {


    public static void main(String[] args) {

        int[] arr = {4, 0, 5, 3, 1, 2, 3};

        boolean r1 = checkDuplicates1(arr);
        boolean r2 = checkDuplicates2(arr);
        boolean r3 = checkDuplicates3(arr);
        boolean r4 = checkDuplicates4(arr);
        boolean r5 = checkDuplicates5(arr);
        boolean r6 = checkDuplicates6(arr);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
        System.out.println("r5: " + r5);

        System.out.println("r6: " + r6);
    }

    /* O(n^2) */
    public static boolean checkDuplicates1(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    /* O(n log n) */
    public static boolean checkDuplicates2(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        java.util.Arrays.sort(arr);

        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev) {
                return true;
            }

            prev = arr[i];
        }

        return false;
    }

    /* O(n) runtime and O(n) space */
    public static boolean checkDuplicates3(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }

    /* O(n) runtime and O(n) space */
    public static boolean checkDuplicates4(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        Set set = new HashSet<>(java.util.Arrays.asList(
                IntStream.of(arr).boxed().toArray(Integer[]::new)));

        return arr.length != set.size();
    }

    /* O(n) runtime and O(n) space */
    public static boolean checkDuplicates5(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        Long distinctCount = IntStream.of(arr)
                .boxed()
                .distinct()
                .count();

        return arr.length != distinctCount;
    }

    /* O(n) runtime and O(1) space */
    public static boolean checkDuplicates6(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The given array cannot be null or empty");
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else if (arr[Math.abs(arr[i])] == 0) {
                arr[Math.abs(arr[i])] = -(arr.length-1);
            } else {
                return true;
            }
        }

        return false;
    }
}
