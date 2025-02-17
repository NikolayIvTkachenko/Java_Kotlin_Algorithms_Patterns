package org.example.patterns.StatePattern;

public interface PossibleState {
    void pressOnButton(TV context);
    void pressOFFButton(TV context);
    void pressMuteButton(TV context);
}
