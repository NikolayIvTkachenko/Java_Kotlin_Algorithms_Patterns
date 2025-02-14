package org.example.patterns.DecoratorPattern;

public class PaintDecorator extends AbstractDecorator {

    public void makeHouse() {
        super.makeHouse();
        //Decorating now
        System.out.println("***Paint decorator is in action now***");
        paintTheHouse();
    }

    private void paintTheHouse() {
        System.out.println("Now I am painting the house.");
    }
}
