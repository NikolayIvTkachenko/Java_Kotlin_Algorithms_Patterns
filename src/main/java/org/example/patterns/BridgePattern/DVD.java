package org.example.patterns.BridgePattern;

public class DVD extends ElectronicGoods {
    public DVD(State state) {
        super(state);
    }

    public void doublePress() {
        hardButtonPressed();
        hardButtonPressed();
    }

}
