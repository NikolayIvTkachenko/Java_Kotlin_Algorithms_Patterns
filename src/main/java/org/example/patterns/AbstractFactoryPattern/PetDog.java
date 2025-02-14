package org.example.patterns.AbstractFactoryPattern;

public class PetDog implements Dog {

    public PetDog() {}

    public PetDog(String color) {
        System.out.println("Pet Dog with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Pet Pet Dog says: Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dogs prefer barking...");
    }
}
