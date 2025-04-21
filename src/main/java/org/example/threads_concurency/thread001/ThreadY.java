package org.example.threads_concurency.thread001;

public class ThreadY implements Runnable{
    int iTotal;
    public void run() {
        synchronized (this) {
            for(int iValue=0; iValue < 1000; iValue++) {
                iTotal = iTotal + iValue;
                System.out.println(iTotal);
            }
            notify();
        }
    }
}
