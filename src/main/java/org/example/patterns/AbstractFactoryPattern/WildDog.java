package org.example.patterns.AbstractFactoryPattern;

public class WildDog implements Dog {

    public WildDog() {}

    public WildDog(String color) {
        System.out.println("Wild Dog with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Will Dog says: Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Dogs prefer barking...");
    }
}
