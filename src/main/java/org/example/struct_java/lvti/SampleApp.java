package org.example.struct_java.lvti;

import java.util.ArrayList;
import java.util.List;

public class SampleApp {
    public static void main(String[] args) {
        var playerList = new ArrayList<String>();

        Player p1 = new Player();
        p1.name = "Jhon";
        Player p2 = new Player();
        p2.name = "Donald";

        var listOfPlayer = List.of(p1, p2);
        System.out.println(listOfPlayer);

    }
}
