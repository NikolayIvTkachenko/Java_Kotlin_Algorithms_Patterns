package org.example.patterns.MementoPattern;

public class Originator {
    private int stateId;

    public Originator() {
        this.stateId = 0;
        System.out.println("Originator is created with state id : " + stateId);
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public Memento saveMemento(int stateId) {
        System.out.println("Saving originator's current state id. ");
        return new Memento(stateId);
    }

    public void revertMemento(Memento previousMemento) {
        System.out.println("Restoring to state id..." + previousMemento.getStartedId());
        this.stateId = previousMemento.getStartedId();
        System.out.println("Current state id of originator : " + stateId);
    }
}
