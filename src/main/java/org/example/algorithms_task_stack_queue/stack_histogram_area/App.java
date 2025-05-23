package org.example.algorithms_task_stack_queue.stack_histogram_area;

public class App {
    public static void main(String[] args) {

        int[] histogram = {4, 2, 8, 6, 5, 3};

        int ma = Stacks.maxAreaUsingStack(histogram);

        System.out.println("Max area: " + ma);
    }
}
