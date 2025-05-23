package org.example.algorithms_task_oop.method_hiding;

public class App {
    public static void main(String[] args) {

        Vehicle.move(); // call Vehicle#move()
        Car.move();     // call Car#move()
    }
}
