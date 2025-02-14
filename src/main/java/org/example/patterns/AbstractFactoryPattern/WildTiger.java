package org.example.patterns.AbstractFactoryPattern;

public class WildTiger implements Tiger {

    public WildTiger() {}

    public WildTiger(String color) {
        System.out.println("Wild Tiger with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Wild Tiger says softly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tiger prefer hunting...");
    }
}
