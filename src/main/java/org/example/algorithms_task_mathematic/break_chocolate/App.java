package org.example.algorithms_task_mathematic.break_chocolate;

public class App {
    public static void main(String[] args) {
        int result = Chocolates.breakit(12, 10, 8);
        System.out.println("(-1: not possible; 0: no breaks needed; "
                + "1: one break; 2: two breaks): " + result);
    }
}
