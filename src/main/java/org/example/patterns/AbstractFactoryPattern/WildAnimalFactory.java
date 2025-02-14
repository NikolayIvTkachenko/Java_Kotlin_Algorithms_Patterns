package org.example.patterns.AbstractFactoryPattern;

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }
}
