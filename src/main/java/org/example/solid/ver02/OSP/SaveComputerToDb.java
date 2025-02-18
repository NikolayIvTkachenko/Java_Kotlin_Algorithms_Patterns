package org.example.solid.ver02.OSP;

public class SaveComputerToDb implements SaveInterface {
    @Override
    public void save(Computer computer) {
        System.out.println("Save computer to Db " + computer);
    }
}
