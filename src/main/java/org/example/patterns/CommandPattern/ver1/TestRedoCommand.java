package org.example.patterns.CommandPattern.ver1;

public class TestRedoCommand implements Command{

    private Receiver receiver;

    public TestRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
