package org.example.article_oop_solid.solid.after;

import org.example.article_oop_solid.solid.before.BaseRobot;
import org.example.article_oop_solid.solid.before.MilitaryRobot;
import org.example.article_oop_solid.solid.before.TransportRobot;
import org.example.article_oop_solid.solid.before.UtilityRobot;

public class NotificationManager {
    public NotificationManager() {}

    private void sendMessage(String... message) {
        System.out.println("Start message");
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
        System.out.println("End message");
    }

    public void prepareAndSendMessage(BaseRobot robot) {
        if(robot instanceof TransportRobot) {
            TransportRobot item = (TransportRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , weight point: " + item.getCargoWeight()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        } else if (robot instanceof MilitaryRobot) {
            MilitaryRobot item = (MilitaryRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , attack point: " + item.getAttack()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        } else if (robot instanceof UtilityRobot) {
            UtilityRobot item = (UtilityRobot) robot;
            String messagePosition = "X: " + item.getxPosition() + " , Y: " + item.getyPosition();
            String messageData = "UUID: " + item.getUuid() + " , repair point: " + item.getRepairPointShield()
                    + " , power: " + item.getPower() + " , shield: " + item.getShield();
            sendMessage(messagePosition, messageData);
        }
    }
}
