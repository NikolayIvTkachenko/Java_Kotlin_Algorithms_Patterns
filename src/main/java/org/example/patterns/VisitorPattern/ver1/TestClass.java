package org.example.patterns.VisitorPattern.ver1;

public class TestClass implements OriginalInterface {

    private int testInt;

    public TestClass() {
        testInt = 5;
    }

    public int getTestInt() {
        return testInt;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
