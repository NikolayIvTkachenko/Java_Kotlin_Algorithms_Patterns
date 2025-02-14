package org.example.patterns.AbstractFactoryPattern;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory testAnimalFactory;
        Dog testDog;
        Tiger testTiger;
        System.out.println("***Abstract Factory Pattern Demo***\n");

        testAnimalFactory = new WildAnimalFactory();
        testDog = testAnimalFactory.createDog();
        testDog.speak();
        testDog.preferredAction();

        testTiger = testAnimalFactory.createTiger();
        testTiger.speak();
        testTiger.preferredAction();

        System.out.println("\n*******************\n");

        testAnimalFactory = new PetAnimalFactory();
        testDog = testAnimalFactory.createDog();
        testDog.speak();
        testDog.preferredAction();

        testTiger = testAnimalFactory.createTiger();
        testTiger.speak();
        testTiger.preferredAction();

    }
}
