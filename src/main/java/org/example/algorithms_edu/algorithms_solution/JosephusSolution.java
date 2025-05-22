package org.example.algorithms_edu.algorithms_solution;

import java.util.ArrayDeque;
import java.util.Queue;

public class JosephusSolution {

    public static void main(String[] args) {

        // 15 people, eliminating every 3th person until only one person is left
        // the survivor should be number 5
        int n = 15;
        int k = 3;

        System.out.println("Using recursion! Survivor: " + josephus(n, k) + "\n");

        printJosephus(n, k);
    }

    // plain recursive
    public static int josephus(int n, int k) {

        if (k <= 0 || n <= 0) {
            return -1;
        }

        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }

    // using Queue
    public static void printJosephus(int n, int k) {

        if (n <= 0 || k <= 0) {
            throw new IllegalArgumentException("The n and k numbers must be > 0");
        }

        Queue<Integer> circle = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        while (circle.size() != 1) {
            for (int i = 1; i <= k; i++) {
                int eliminated = circle.poll();

                if (i == k) {
                    System.out.println("Eliminated: " + eliminated);
                    break;
                }

                circle.add(eliminated);
            }
        }

        System.out.println("Using queue! Survivor: " + circle.peek());
    }

}
