package org.example.solid.ver02.SRP.before;

import org.example.patterns.CommandPattern.ver2.Command;

public class Computer {

    String name;
    int memory_size;

    public Computer(String name, int memory_size) {
        this.name = name;
        this.memory_size = memory_size;
    }

    public void save() {
        System.out.println("Save data of class to File");
    }

    public void load() {
        System.out.println("load data of class from File");
    }

}
