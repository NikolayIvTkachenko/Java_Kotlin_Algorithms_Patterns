package org.example.solid.ver02.SRP.after;


public class srpExample {
    public static void main(String[] args) {
        Computer computer = new Computer("AGAT", 100000);
        ManagerComputer managerComputer = new ManagerComputer();
        managerComputer.save(computer);
        managerComputer.load(computer);
    }
}
