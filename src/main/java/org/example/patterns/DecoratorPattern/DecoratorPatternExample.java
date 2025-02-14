package org.example.patterns.DecoratorPattern;

public class DecoratorPatternExample {

    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***\n");

        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();

        System.out.println("_______________________________");
        System.out.println("Using a Floor decorator now");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setTheComponent(withoutDecorator);
        floorDecorator.makeHouse();

        System.out.println("________________________");
        System.out.println("Using a Paint decorator now");
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setTheComponent(floorDecorator);
        paintDecorator.makeHouse();
        System.out.println("________________________");

    }

}
