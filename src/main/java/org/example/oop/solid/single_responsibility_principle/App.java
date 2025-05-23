package org.example.oop.solid.single_responsibility_principle;

import org.example.oop.solid.single_responsibility_principle.good.AreaConverter;

public class App {
    public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow SRP:\n");

        org.example.oop.solid.single_responsibility_principle.bad.RectangleAreaCalculator rac1
                = new org.example.oop.solid.single_responsibility_principle.bad.RectangleAreaCalculator(4, 2);

        int area1 = rac1.area();
        System.out.println("Area in meters: " + area1);

        System.out.println("Area in inches: " + rac1.metersToInches(area1));

        System.out.println("\nApproach that follow SRP:\n");

        org.example.oop.solid.single_responsibility_principle.good.RectangleAreaCalculator rac2
                = new org.example.oop.solid.single_responsibility_principle.good.RectangleAreaCalculator(4, 2);

        int area2 = rac2.area();
        System.out.println("Area in meters: " + area2);

        AreaConverter converter = new AreaConverter();

        System.out.println("Area in inches: " + converter.metersToInches(area2));
        System.out.println("Area in feet: " + converter.metersToFeet(area2));

    }
}
