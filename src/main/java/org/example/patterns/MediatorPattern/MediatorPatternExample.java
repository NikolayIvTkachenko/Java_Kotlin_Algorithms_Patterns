package org.example.patterns.MediatorPattern;

public class MediatorPatternExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("*** Mediator Pattern Demo ***\n");
        ConcreteMediator mediator = new ConcreteMediator();

        JuniorEmployee michail = new JuniorEmployee(mediator, "Michail");
        JuniorEmployee nickolay = new JuniorEmployee(mediator, "Nickolay");
        JuniorEmployee john = new JuniorEmployee(mediator, "John");

        mediator.register(michail);
        mediator.register(nickolay);
        mediator.register(john);

        mediator.displayRegisteredEmployees();

        System.out.println("Communication starts among participants....");
        michail.sendMessage(" Hi, Nickolay, can we discuss the mediator pattern?");
        nickolay.sendMessage(" Hi, John, please get back to work quickly");
        john.sendMessage(" Hi, Michail, yup, we can discuss now.");

        Unknown unknown = new Unknown(mediator, "Jack");
        unknown.sendMessage("Hello Guys...");

    }
}
