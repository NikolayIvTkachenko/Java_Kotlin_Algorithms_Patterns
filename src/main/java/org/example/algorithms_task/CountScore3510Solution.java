package org.example.algorithms_task;

public class CountScore3510Solution {

    public static void main(String[] args) {

        System.out.println("33: " + count(33));
        System.out.println("18: " + count(18));
    }

    public static int count(int n) {

        if (n <= 0) {
            return -1;
        }

        int[] table = new int[n + 1];

        table[0] = 1;

        for (int i = 3; i <= n; i++) {
            table[i] += table[i - 3];
        }
        for (int i = 5; i <= n; i++) {
            table[i] += table[i - 5];
        }
        for (int i = 10; i <= n; i++) {
            table[i] += table[i - 10];
        }

        return table[n];
    }
}
