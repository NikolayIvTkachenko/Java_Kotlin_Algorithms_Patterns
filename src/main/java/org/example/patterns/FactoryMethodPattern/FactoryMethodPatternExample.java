package org.example.patterns.FactoryMethodPattern;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        System.out.println("***Factory Pattern Demo***\n");

        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();

        System.out.println("***Factory Pattern Demo 2***\n");

        Animal aTigerV2 = tigerFactory.makeAnimal();
        aTigerV2.speak();
        aTigerV2.preferredAction();

        Animal aDogV2 = dogFactory.makeAnimal();
        aDogV2.speak();
        aDogV2.preferredAction();

    }
}
