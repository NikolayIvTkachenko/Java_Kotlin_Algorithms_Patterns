package org.example.oop.solid.open_closed_principle.good;

public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
