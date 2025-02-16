package org.example.patterns.BridgePattern;

public class OnState implements State {

    @Override
    public void moveState() {
        System.out.println("On State\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\t The device is already On. Do not press the button so hard.\n");
    }
}
