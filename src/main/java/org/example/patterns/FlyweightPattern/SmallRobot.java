package org.example.patterns.FlyweightPattern;

public class SmallRobot implements Robot {

    private String robotTypeCreated = "service";

    public SmallRobot() {
        robotTypeCreated = "A small robot created";
        System.out.println(robotTypeCreated);
    }


    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color ");
    }
}
