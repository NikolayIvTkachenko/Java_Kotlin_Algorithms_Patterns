package org.example.patterns.BridgePattern;

public class OffState implements State {
    @Override
    public void moveState() {
        System.out.print("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.print("\t The device is Offline now. Do not press the off butoon again.\n");
    }
}
