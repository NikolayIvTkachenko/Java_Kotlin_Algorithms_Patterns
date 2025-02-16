package org.example.patterns.CommandPattern.ver1;

public class TestUndoCommand implements Command {

    private Receiver receiver;

    public TestUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToUndo();
        receiver.performUndo();
    }
}
