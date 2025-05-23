package org.example.algorithms_task_threads.thread_lifecycle_state;

public class BlockedThread {

    public void blockedThread() {
        Thread t1 = new Thread(new SyncBlockCode());
        Thread t2 = new Thread(new SyncBlockCode());

        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            // log ex
        }
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            // log ex
        }

        System.out.println("Blocked thread t1: "
                + t1.getState() + "(" + t1.getName() + ")");
        System.out.println("Blocked thread t2: "
                + t2.getState() + "(" + t2.getName() + ")");

        System.exit(0);
    }

    private static class SyncBlockCode implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread "
                    + Thread.currentThread().getName() + " is in run() method");
            syncMethod();
        }

        public static synchronized void syncMethod() {
            System.out.println("Thread "
                    + Thread.currentThread().getName() + " is in syncMethod() method");
            while (true) {
                // t1 will stay here forever, therefore t2 is blocked
            }
        }
    }
}
