package org.example.solid.ver02.OSP;

public class ospExample {
    public static void main(String[] args) {
        Computer computer = new Computer("AGAT", 100000);
        SaveComputerToDb saveComputerToDb = new SaveComputerToDb();
        SaveComputerToFile saveComputerToFile = new SaveComputerToFile();

        saveComputerToDb.save(computer);
        saveComputerToFile.save(computer);

    }
}
