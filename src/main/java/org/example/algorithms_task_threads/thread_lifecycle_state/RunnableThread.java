package org.example.algorithms_task_threads.thread_lifecycle_state;

// Scenario for the RUNNABLE state:

/*
    The following snippet of code should print RUNNABLE, since we print the state of
    the thread after calling start(). But because of thread-scheduler internal
    mechanisms, this is not guaranteed.
*/

public class RunnableThread {

    public void runnableThread() {
        Thread t1 = new Thread(() -> {
        });
        t1.start();

        System.out.println("RunnableThread t1: " + t1.getState());

        Runnable runnable1 = () -> {
        };
        Thread t2 = new Thread(runnable1);
        t2.start();
        System.out.println("RunnableThread t2: " + t2.getState());

        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
            }
        });
        t3.start();
        System.out.println("RunnableThread t3: " + t3.getState());

        Thread t4 = new Thread(new Thread() {

            @Override
            public void run() {
            }
        });
        t4.start();
        System.out.println("RunnableThread t4: " + t4.getState() + "\n");
    }
}