package org.example.solid.ver02.OSP;

public class Computer {
    String name;
    int memory_size;

    public Computer(String name, int memory_size) {
        this.name = name;
        this.memory_size = memory_size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", memory_size=" + memory_size +
                '}';
    }
}

