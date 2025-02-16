package org.example.patterns.BridgePattern;

public class ElectronicGoods {
    protected State state;

    public ElectronicGoods(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void moveToCurrentState() {
        System.out.print("The electronic item is functioning at : " );
        state.moveState();
    }

    public void hardButtonPressed() {
        state.hardPressed();
    }

}
