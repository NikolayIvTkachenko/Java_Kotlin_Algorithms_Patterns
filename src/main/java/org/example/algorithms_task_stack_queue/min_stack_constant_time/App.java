package org.example.algorithms_task_stack_queue.min_stack_constant_time;

public class App {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(25);
        stack.push(35);
        stack.push(15);

        System.out.println("Min: " + stack.min());

        stack.push(-1);
        stack.push(-3);
        stack.push(6);

        System.out.println("Min: " + stack.min());

        stack.pop();
        stack.pop();

        System.out.println("Min: " + stack.min());
    }
}
