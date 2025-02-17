package org.example.patterns.StatePattern;

public class Mute implements PossibleState {

    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On button. Going from Mute to On state.");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOFFButton(TV context) {
        System.out.println("You pressed Off button. Going from Mute to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button. TV is already in Mute mode. ");
    }

    @Override
    public String toString() {
        return "";
    }
}
