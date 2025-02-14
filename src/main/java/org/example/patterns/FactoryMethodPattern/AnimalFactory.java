package org.example.patterns.FactoryMethodPattern;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();

    public Animal makeAnimal() {
        System.out.println("*** AnimalFactory => makeAnimal()");
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
}
