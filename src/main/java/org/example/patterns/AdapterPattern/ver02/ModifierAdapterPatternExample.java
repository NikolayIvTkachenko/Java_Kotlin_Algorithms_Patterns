package org.example.patterns.AdapterPattern.ver02;

import java.util.ArrayList;
import java.util.List;

public class ModifierAdapterPatternExample {
    public static void main(String[] args) {

        System.out.println("*** Adapter Pattern Modified Demo ***\n");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is: " + rectangle.calculateAreaOfRectangle() + " Square unit.");
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of Triangle is : " + triangle.calculateAreaOfTriangle() + " Square unit.");
        RectInterface adapter = new TriangleAdapter(triangle);
        System.out.println("Area of Triangle using the triangle adapter is: " + getArea(adapter) + " Square unit.");

        //pattern
        List<RectInterface> rectangleObjects = new ArrayList<RectInterface>();
        rectangleObjects.add(rectangle);

        rectangleObjects.add(adapter);
        System.out.println("");
        System.out.println("***** Current objects in the system are: *****");


        for(RectInterface rectObjects: rectangleObjects) {
            rectObjects.aboutRectangle();
        }
    }

    static double getArea(RectInterface r){
        return r.calculateAreaOfRectangle();
    }
}
