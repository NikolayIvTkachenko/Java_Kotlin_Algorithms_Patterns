package org.example.patterns.AbstractFactoryPattern;

public class PetAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger() {
        return new PetTiger();
    }

    @Override
    public Dog createDog(String color) {
        return new PetDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }
}
