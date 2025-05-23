package org.example.algorithms_task;

import java.util.Stack;

public class TrapRainWaterSolution {

    public static void main(String[] args) {

        int[] bars = {1, 0, 0, 4, 0, 2, 0, 1, 6, 2, 3};
        // int[] bars = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};  // 25
        // int[] bars = {0, 3, 0, 4, 3, 0, 3, 5, 4, 3, 4, 3}; // 10
        // int[] bars = {1, 0, 2, 2, 4, 0, 1, 5, 2, 1, 6, 1}; // 15
        // int[] bars = {0, 0, 0, 3}; // 0
        // int[] bars = {4, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // 14
        // int[] bars = {0, 1, 2}; // 0

        int water1 = trapViaArray(bars);
        int water2 = trapViaStack(bars);
        int water3 = trapOptimized(bars);
        System.out.println("Result: " + water1 + " | " + water2 + " | " + water3);
    }

    /* O(n) runtime and O(n) auxiliary space using array */
    public static int trapViaArray(int[] bars) {

        if (bars == null || bars.length == 0) {
            return 0;
        }

        int n = bars.length - 1;
        int water = 0;

        // store the maximum height of a bar to the left of the current bar
        int[] left = new int[n];
        left[0] = Integer.MIN_VALUE;

        // iterate the bars from left to right and compute each left[i]
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], bars[i - 1]);
        }

        // store the maximum height of a bar to the right of the current bar
        int right = Integer.MIN_VALUE;

        // iterate the bars from right to left and compute the trapped water
        for (int i = n - 1; i >= 1; i--) {

            right = Math.max(right, bars[i + 1]);

            // check if it is possible to store water in the current bar
            if (Math.min(left[i], right) > bars[i]) {
                water += Math.min(left[i], right) - bars[i];
            }
        }

        return water;
    }

    /* O(n) runtime and O(n) auxiliary space using Stack */
    public static int trapViaStack(int[] bars) {

        if (bars == null || bars.length == 0) {
            return 0;
        }

        int water = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < bars.length; i++) {

            while (!stack.empty() && bars[i] > bars[stack.peek()]) {
                int topBar = stack.pop();

                // if the stack is empty then it can't trap water
                if (stack.empty()) {
                    continue;
                }

                int width = i - stack.peek() - 1;
                int height = Math.min(bars[i], bars[stack.peek()]) - bars[topBar];

                water += width * height;
            }

            stack.push(i);
        }

        return water;
    }

    /* O(n) runtime and O(1) auxiliary space */
    public static int trapOptimized(int[] bars) {

        // take two pointers: left and right pointing to 0 and bars.length-1
        int left = 0;
        int right = bars.length - 1;

        int water = 0;

        int maxBarLeft = bars[left];
        int maxBarRight = bars[right];

        while (left < right) {
            // move left pointer to the right
            if (bars[left] <= bars[right]) {
                left++;
                maxBarLeft = Math.max(maxBarLeft, bars[left]);
                water += (maxBarLeft - bars[left]);
                // move right pointer to the left
            } else {
                right--;
                maxBarRight = Math.max(maxBarRight, bars[right]);
                water += (maxBarRight - bars[right]);
            }
        }

        return water;
    }
}
