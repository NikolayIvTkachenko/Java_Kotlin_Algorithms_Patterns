package org.example.prepare_code_java_interview.java_code;

public class TestForThreadV2  implements Runnable {

    public static void main(String qrguments[]) {
        TestForThreadV2 myThread = new TestForThreadV2();
        Thread thread = new Thread(myThread);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Inside Run Method..2...");
    }
}
