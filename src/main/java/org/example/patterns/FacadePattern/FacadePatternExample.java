package org.example.patterns.FacadePattern;

public class FacadePatternExample {
    public static void main(String[] args) {
        System.out.println("*** Facade Pattern Demo ***\n");

        RobotFacade milanoRobotFacde = new RobotFacade();
        milanoRobotFacde.constructMilanoRobot();

        RobotFacade robonautRobotFacade = new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();

        milanoRobotFacde.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();
    }
}
