package org.example.article_oop_solid.solid.after;

public class DashboardNotificationManager  extends BaseNotificationManager {
    @Override
    protected void sendMessage(String... message) {
        System.out.println("Dashboard Notification processing ... ");
        System.out.println("Start message - dashboard");
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
        System.out.println("End message - dashboard");
    }
}
