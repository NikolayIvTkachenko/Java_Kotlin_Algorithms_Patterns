package org.example.article_oop_solid.solid.after;

public class LogNotificationManager  extends BaseNotificationManager {
    @Override
    protected void sendMessage(String... message) {
        System.out.println("Log Notification processing ... ");
        System.out.println("Start message - logs");
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
        System.out.println("End message - logs");
    }
}
