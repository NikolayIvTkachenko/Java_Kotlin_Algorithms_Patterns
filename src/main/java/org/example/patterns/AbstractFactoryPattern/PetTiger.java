package org.example.patterns.AbstractFactoryPattern;

public class PetTiger implements Tiger {

    public PetTiger() {}

    public PetTiger(String color) {
        System.out.println("Pet Tiger with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tiger prefer hunting...");
    }
}
