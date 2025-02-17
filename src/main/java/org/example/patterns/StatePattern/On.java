package org.example.patterns.StatePattern;


//On state
public class On implements PossibleState {

    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On button. TV is already in On state.");
    }

    @Override
    public void pressOFFButton(TV context) {
        System.out.println("You pressed Off button. Going from On to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button. Going from On to Mute mode.");
        context.setCurrentState(new Mute());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public String toString() {
        return "\t**TV is switched on now.**";
    }
}
