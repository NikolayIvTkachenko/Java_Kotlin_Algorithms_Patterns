package org.example.solid.ver02.LSP;

public class lspExample {
    public static void main(String[] args) {
        Computer computer = new Computer("AGAT", 100000);
        SaveComputerToDb saveComputerToDb = new SaveComputerToDb();
        saveComputerToDb.save(computer);

        test();

    }

    //Демонстрация нарушения принципа Барбары Лисков
    //Дочерние классы должны расширять, но не менять функционал
    public static void test() {
        Computer computer = new Computer("AGAT", 100000);
        OmenHpComputer omenHpComputer = new OmenHpComputer("OMEN", 100000);

        omenHpComputer.setName("POISK");
        if(computer.name.compareTo(omenHpComputer.name) == 0 && computer.memory_size == omenHpComputer.memory_size) {
            System.out.println("Success Test");
        } else {
            System.out.println("Failed Test");
        }
    }
}
