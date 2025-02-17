package org.example.patterns.MementoPattern;

public class Memento {
    private int startedId;

    public Memento(int startedId) {
        this.startedId = startedId;
    }

    public int getStartedId() {
        return startedId;
    }

    public void setStartedId(int startedId) {
        this.startedId = startedId;
    }
}
