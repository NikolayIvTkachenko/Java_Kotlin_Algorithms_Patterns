package org.example.patterns.StatePattern;

public class StatePatternExample {
    public static void main(String[] args) {

        System.out.println("*** State Pattern Demo ***\n");

        TV tv = new TV();
        System.out.println("User is pressing buttons in the following sequence: ");
        System.out.println("Off -> Mute -> On -> On -> Mute -> Mute ->Off\n");

        tv.pressOffButton();
        tv.pressMuteButton();
        tv.pressOnButton();

        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressMuteButton();

        tv.pressOffButton();
    }
}
