package org.example.oop.solid.open_closed_principle;

import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow OCP:\n");

        org.example.oop.solid.open_closed_principle.bad.Circle c1 = new org.example.oop.solid.open_closed_principle.bad.Circle(4);
        org.example.oop.solid.open_closed_principle.bad.Circle c2 = new org.example.oop.solid.open_closed_principle.bad.Circle(3);
        org.example.oop.solid.open_closed_principle.bad.Rectangle r1 = new org.example.oop.solid.open_closed_principle.bad.Rectangle(5,3);

        List<org.example.oop.solid.open_closed_principle.bad.Shape> shapes1 = List.of(c1, c2, r1);

        org.example.oop.solid.open_closed_principle.bad.AreaCalculator rac1
                = new org.example.oop.solid.open_closed_principle.bad.AreaCalculator(shapes1);

        System.out.println("Sum area: " + rac1.sum());

        System.out.println("\nApproach that follow OCP:\n");

        org.example.oop.solid.open_closed_principle.good.Circle c11 = new org.example.oop.solid.open_closed_principle.good.Circle(4);
        org.example.oop.solid.open_closed_principle.good.Circle c21 = new org.example.oop.solid.open_closed_principle.good.Circle(3);
        org.example.oop.solid.open_closed_principle.good.Rectangle r11 = new org.example.oop.solid.open_closed_principle.good.Rectangle(5,3);

        List<org.example.oop.solid.open_closed_principle.good.Shape> shapes2 = List.of(c11, c21, r11);

        org.example.oop.solid.open_closed_principle.good.AreaCalculator rac2
                = new org.example.oop.solid.open_closed_principle.good.AreaCalculator(shapes2);

        System.out.println("Sum area: " + rac2.sum());
    }
}
