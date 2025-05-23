package org.example.algorithms_task_sort_algo.sort_stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(4);

        System.out.println("Before sorting: " + stack);

        Stacks.sort(stack);

        System.out.println("After sorting: " + stack);
    }
}
