package org.example.struct_java.objects_unmutable;

import org.example.struct_java.lvti.Player;

import java.util.HashSet;
import java.util.Set;

public class SampleApp002 {
    public static void main(String[] args) {

        //programm001();
        //programm002();
        try {
            programm003();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void programm003() throws CloneNotSupportedException {
        Point point1 = new Point(5, 4);
        Point point2 = point1.clone();
        System.out.println("point1.hasCode = " + point1.hashCode());
        System.out.println("point2.hasCode = " + point2.hashCode());
    }

    public static void programm002() {
        Player p1 = new Player();
        Player p2 = new Player();

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p1);
        System.out.println("p1.hasCode = " + p1.hashCode());
        System.out.println("p2.hasCode = " + p2.hashCode());
    }


    public static void programm001() {
        try {
            CarSample carSample = new CarSample(null, Color.BLUE);
            System.out.println("CarSample = " + carSample);
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }
}
