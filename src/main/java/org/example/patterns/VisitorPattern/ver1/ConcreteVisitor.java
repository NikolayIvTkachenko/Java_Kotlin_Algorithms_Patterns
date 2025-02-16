package org.example.patterns.VisitorPattern.ver1;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(TestClass testClassObject) {
        System.out.println("Current value of testInt=" + testClassObject.getTestInt());
        System.out.println("Visitor will make it double and display it.");
        System.out.println("Current value of testInt =" +2* testClassObject.getTestInt());
        System.out.println("Exiting from Visitor.");
    }
}
