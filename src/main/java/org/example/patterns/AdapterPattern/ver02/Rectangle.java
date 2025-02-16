package org.example.patterns.AdapterPattern.ver02;

public class Rectangle implements RectInterface {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Recangle object with length: " + this.length + " unit and width: " + this.width + " unit.");
    }

    @Override
    public double calculateAreaOfRectangle() {
        return length * width;
    }
}
