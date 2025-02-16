package org.example.patterns.CommandPattern.ver1;

public class CommandPatternExample {

    public static void main(String[] args) {

        System.out.println("*** Command Pattern Demo ***\n");

        Receiver intendedReceiver = new Receiver();
        TestUndoCommand undoCommand = new TestUndoCommand(intendedReceiver);

        //Invoker invoker = new Invoker(undoCommand);
        Invoker invoker = new Invoker();
        invoker.setCommand(undoCommand);
        invoker.invokeCommand();

        TestRedoCommand redoCommand = new TestRedoCommand(intendedReceiver);
        invoker.setCommand(redoCommand);
        invoker.invokeCommand();

    }

}
