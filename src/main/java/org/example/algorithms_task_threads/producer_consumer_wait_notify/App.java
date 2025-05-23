package org.example.algorithms_task_threads.producer_consumer_wait_notify;

public class App {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tT] [%4$-7s] %5$s %n");

        ProducerConsumer.startProducerConsumer();
        Thread.sleep(10 * 1000);
        ProducerConsumer.stopProducerConsumer();
    }
}
