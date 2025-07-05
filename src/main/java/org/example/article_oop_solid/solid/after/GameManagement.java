package org.example.article_oop_solid.solid.after;

import org.example.article_oop_solid.solid.before.MilitaryRobot;

public class GameManagement {

    public static void main(String[] args) {
        StateSaveGameRepository repository;
        Boolean network = true;
        if (network) {
            repository = new NetworkStateSaveGameRepository();
        } else {
            repository = new LocalStateSaveGameRepository();
        }
        repository.saveStateGame();
    }

}

//--------------------------------------------------------------------------------//
//        LogNotificationManager logNotificationManager = new LogNotificationManager();
//        DatabaseNotificationManager databaseNotificationManager = new DatabaseNotificationManager();
//        DashboardNotificationManager dashboardNotificationManager = new DashboardNotificationManager();
//
//        MilitaryRobot m1 = new MilitaryRobot( 5, 5, 1,
//                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS*2);
//        MilitaryRobot m2 = new MilitaryRobot( 5, 5, 1,
//                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS);
//
//        logNotificationManager.prepareAndSendMessage(m1);
//        logNotificationManager.prepareAndSendMessage(m2);
//
//        databaseNotificationManager.prepareAndSendMessage(m1);
//        databaseNotificationManager.prepareAndSendMessage(m2);
//
//        dashboardNotificationManager.prepareAndSendMessage(m1);
//        dashboardNotificationManager.prepareAndSendMessage(m2);

//--------------------------------------------------------------------------------//
//        NotificationManager notificationManager = new NotificationManager();
//        MilitaryRobot m1 = new MilitaryRobot( 5, 5, 1,
//                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS*2);
//        MilitaryRobot m2 = new MilitaryRobot( 5, 5, 1,
//                ConstantApp.getInstance().ROBOT_MILITARY_ATTACK_POINTS);
//
//        notificationManager.prepareAndSendMessage(m1);
//        notificationManager.prepareAndSendMessage(m2);
