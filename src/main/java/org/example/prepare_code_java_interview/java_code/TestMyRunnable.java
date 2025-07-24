package org.example.prepare_code_java_interview.java_code;

public class TestMyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Run Method...");
        System.out.println("Name of thread is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("main method start");
        System.out.println("Main block - Name of thread is: " + Thread.currentThread().getName());

        TestMyRunnable runnable = new TestMyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
