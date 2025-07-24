package org.example.prepare_code_java_interview.java_code;

public class TestForThread extends Thread {
    public static void main(String[] args) {

        TestForThread thread = new TestForThread();
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("Inside Run Method...");
    }
}
