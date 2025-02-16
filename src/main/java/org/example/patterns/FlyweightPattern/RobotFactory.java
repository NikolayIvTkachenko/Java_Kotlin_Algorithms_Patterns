package org.example.patterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String, Robot> robotFactory = new HashMap<String, Robot>();

    public int totalObjectsCreated() {
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
        Robot robotCategory = robotFactory.get(robotType);
        if(robotCategory==null) {
            switch(robotType) {
                case "small":
                    System.out.println("We do not have small size at present");
                    robotCategory = new SmallRobot();
                    break;
                case "large":
                    System.out.println("We do not have large size at present");
                    robotCategory = new LargeRobot();
                    break;
                case "fixed":
                    System.out.println("We do not have fixed size at present");
                    robotCategory = new FixedSizeRobot();
                    break;
                default:
                    System.out.println("Robot Factory can create only small, large or fixed size robots");
            }
            robotFactory.put(robotType, robotCategory);
        } else {
            System.out.println("\n \t Using existing " + robotType + " robot and coloring it");
        }
        return robotCategory;
    }

}
