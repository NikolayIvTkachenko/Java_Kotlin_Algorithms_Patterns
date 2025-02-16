package org.example.patterns.VisitorPattern.ver2;

public interface Employee {
    void printStructures();
    void acceptVisitor(Visitor visitor);
}
