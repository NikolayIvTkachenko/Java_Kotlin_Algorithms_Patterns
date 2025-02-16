package org.example.patterns.CommandPattern.ver2;

public class Invoker {
    Command commandToBePerformed;

    public void setCommand(Command command) {
        this.commandToBePerformed = command;
    }

    public void executeCommand() {
        commandToBePerformed.executeDo();
    }

    public void undoCommand() {
        commandToBePerformed.executeUnDo();
    }

}
