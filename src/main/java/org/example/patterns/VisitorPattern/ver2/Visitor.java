package org.example.patterns.VisitorPattern.ver2;

public interface Visitor {
    void visitTheElement(CompositeEmployee employee);
    void visitTheElement(SimpleEmployee employee);
}
