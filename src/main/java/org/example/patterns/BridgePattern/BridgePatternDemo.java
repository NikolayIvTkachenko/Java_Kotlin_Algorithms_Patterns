package org.example.patterns.BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("*** Bridge Pattern Demo ***");
        System.out.println("\n Dealing with a Television at present.");

        State presentState = new OnState();
        ElectronicGoods eItem = new Television(presentState);

        eItem.setState(presentState);
        eItem.moveToCurrentState();

        //hard press
        eItem.hardButtonPressed();

        //Verifying Off state of the Television now
        presentState = new OffState();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        System.out.println("]nDealing with a DVD now");
        presentState = new OnState();
        eItem = new DVD(presentState);
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState = new OffState();
        eItem = new DVD(presentState);
        eItem.setState(presentState);
        eItem.moveToCurrentState();



    }
}
