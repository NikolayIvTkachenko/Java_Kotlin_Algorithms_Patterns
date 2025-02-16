package org.example.patterns.AdapterPattern.ver01;

public class CalculatorAdapter {
    public double getARea(Triangle triangle) {
        Calculator c = new Calculator();
        Rectangle rect = new Rectangle();

        rect.lenght = triangle.base;
        rect.width = 0.5 * triangle.height;
        return c.getArea(rect);
    }
}
