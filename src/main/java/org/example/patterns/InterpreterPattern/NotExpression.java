package org.example.patterns.InterpreterPattern;

public class NotExpression implements Employee {

    private Employee emp;

    public NotExpression(Employee emp) {
        this.emp = emp;
    }

    @Override
    public boolean interpret(Context context) {
        return !emp.interpret(context);
    }
}
