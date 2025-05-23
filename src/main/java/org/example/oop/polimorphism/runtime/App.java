package org.example.oop.polimorphism.runtime;

public class App {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        triangle.draw();
        rectangle.draw();
        circle.draw();
    }
}
