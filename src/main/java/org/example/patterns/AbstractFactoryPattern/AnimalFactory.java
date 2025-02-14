package org.example.patterns.AbstractFactoryPattern;

public interface AnimalFactory {
    Dog createDog();
    Tiger createTiger();
    Dog createDog(String color);
    Tiger createTiger(String color);
}
