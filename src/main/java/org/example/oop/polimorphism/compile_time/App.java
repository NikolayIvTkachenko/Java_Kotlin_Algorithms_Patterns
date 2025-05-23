package org.example.oop.polimorphism.compile_time;

public class App {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");
    }
}
