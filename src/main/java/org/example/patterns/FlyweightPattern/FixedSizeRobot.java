package org.example.patterns.FlyweightPattern;

public class FixedSizeRobot implements Robot {
    private String robotTypeCreated;

    public FixedSizeRobot() {
        robotTypeCreated = "A robot with a fixed size created";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + " blue (default) color ");
    }
}
