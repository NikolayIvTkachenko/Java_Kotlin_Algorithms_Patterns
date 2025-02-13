package org.example.patterns.Builder;

public class BuilderPatternExample {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");

        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new MotorCycle("Honda");

        //Making Car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

        //Making MotorCycle
        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
