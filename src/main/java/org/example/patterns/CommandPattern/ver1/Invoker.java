package org.example.patterns.CommandPattern.ver1;

public class Invoker {
    Command commandToBePerformed;

    public Invoker() {}

    public Invoker(Command command) {
        this.commandToBePerformed = command;
    }

    public void setCommand(Command command) {
        this.commandToBePerformed = command;
    }

    public void invokeCommand() {
        commandToBePerformed.executeCommand();
    }
}
