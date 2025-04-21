package org.example.threads_concurency.thread001;

public class ThreadExample001 {
    public static void main(String arg[]) {
        ThreadY threadY = new ThreadY();
        threadY.run();

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
