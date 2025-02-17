package org.example.patterns.CommandPattern.ver2;

public class ModifiedCommandPatternExample {

    public static void main(String[] args) {

        System.out.println("*** Command Pattern Q&As ***");
        System.out.println("****A simple demo with undo supported operations ***\n");
        System.out.println("-----Testing operations in Receiver1-----");
        Receiver intendedreceiver = new Receiver1();
        Command currentCmd = new AdditionCommand(intendedreceiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(currentCmd);
        System.out.println("*Testing a series of do/undo operations**");
        invoker.executeCommand();
        invoker.undoCommand();
        System.out.println("__________");

        invoker.executeCommand();
        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();



    }
}
