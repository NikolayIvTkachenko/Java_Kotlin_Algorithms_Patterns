package org.example.patterns.AdapterPattern.ver02;

public class TriangleAdapter implements RectInterface {

    Triangle triangle;

    public TriangleAdapter(Triangle t) {
        this.triangle = t;
    }

    @Override
    public void aboutRectangle() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
        return triangle.calculateAreaOfTriangle();
    }
}
