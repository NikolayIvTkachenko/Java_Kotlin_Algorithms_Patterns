package org.example.oop.composition;

public class App {
    public static void main(String[] args) {

        Car car = new Car("MyCar");

        System.out.println("Horsepower: " + car.getHorsepower());
    }
}
