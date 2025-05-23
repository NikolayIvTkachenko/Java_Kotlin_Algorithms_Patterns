package org.example.algorithms_task_threads.runnable_and_callable;

import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecuteTask et = new ExecuteTask();

        System.out.println("Run the Callable example\n------------------------");
        et.callableExample();

        System.out.println("\n\nRun the Runnable example\n-----------------------");
        et.runnableExample();
    }
}
