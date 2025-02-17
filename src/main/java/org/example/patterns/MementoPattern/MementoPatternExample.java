package org.example.patterns.MementoPattern;

public class MementoPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Memento Pattern Demo***\n");
        Originator originatorObject = new Originator();
        Memento mementoObject;
        originatorObject.setStateId(1);

        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        System.out.println("Snapshot #1: Originator's current state id is saved in caretaker.\n");

        originatorObject.setStateId(2);
        mementoObject=originatorObject.saveMemento(originatorObject.getStateId());
        System.out.println("Snapshot #2: Originator's current state id is saved in caretaker.\n");

        originatorObject.revertMemento(mementoObject);
    }
}
