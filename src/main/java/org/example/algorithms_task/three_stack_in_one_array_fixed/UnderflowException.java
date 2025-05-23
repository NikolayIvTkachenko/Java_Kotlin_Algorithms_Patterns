package org.example.algorithms_task.three_stack_in_one_array_fixed;

public class UnderflowException extends Exception {

    private static final long serialVersionUID = 7718828512143293558L;

    public UnderflowException(String message) {
        super(message);
    }

    public UnderflowException(String message, Throwable cause) {
        super(message, cause);
    }
}