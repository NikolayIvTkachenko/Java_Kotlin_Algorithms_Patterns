package org.example.solid.ver02.OSP;

public class SaveComputerToFile implements SaveInterface {
    @Override
    public void save(Computer computer) {
        System.out.println("Save computer to File " + computer);
    }
}
