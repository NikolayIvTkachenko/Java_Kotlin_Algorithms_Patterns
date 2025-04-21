package org.example.threads_concurency.thread001;

public class ThreadExample001 {
    public static void main(String arg[]) {
        ThreadY threadY = new ThreadY();
        Thread t = new Thread(threadY);
        //threadY.run();
        t.start();

        ThreadZ threadZ = new ThreadZ();
        threadZ.countThread = 155;

        synchronized (threadY) {
            try {
                System.out.println("Calling wait...");
                threadY.wait();
            } catch (Exception exp) {
                System.out.println("iTotal is: " + threadY.iTotal);
            }
        }
    }
}
