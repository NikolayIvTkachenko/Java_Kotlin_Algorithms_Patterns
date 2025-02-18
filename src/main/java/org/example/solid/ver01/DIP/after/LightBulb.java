package org.example.solid.ver01.DIP.after;

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb on");
    }

    public void turnOff() {
        System.out.println("LightBulb off");
    }
}
