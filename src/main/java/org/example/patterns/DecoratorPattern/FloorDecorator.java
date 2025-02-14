package org.example.patterns.DecoratorPattern;

public class FloorDecorator extends AbstractDecorator {

    public void makeHouse() {
        super.makeHouse();
        //Decorating now
        System.out.println("***Floor decorating is in action ***");
        addFloor();
    }

    private void addFloor() {
        System.out.println("I am making an additional floor on top of it");
    }

}
