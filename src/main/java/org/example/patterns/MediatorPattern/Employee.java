package org.example.patterns.MediatorPattern;

public abstract class Employee {
    protected Mediator mediator;
    protected String name;

    public Employee(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg) throws InterruptedException {
        mediator.sendMessage(this, msg);
    }

    public abstract String employeeType();

}
