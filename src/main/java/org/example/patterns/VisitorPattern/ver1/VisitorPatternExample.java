package org.example.patterns.VisitorPattern.ver1;

public class VisitorPatternExample {

    public static void main(String[] args) {
        System.out.println("*** Visitor Pattern Demo ***\n");
        Visitor visitor = new ConcreteVisitor();
        TestClass testClass = new TestClass();
        testClass.acceptVisitor(visitor);
    }
}
