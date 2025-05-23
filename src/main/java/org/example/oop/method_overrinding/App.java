package org.example.oop.method_overrinding;

import org.example.oop.method_overrinding.inheritance.Child;
import org.example.oop.method_overrinding.inheritance.Parent;
import org.example.oop.method_overrinding.polymorphism.Concrete;
public class App {
    public static void main(String[] args) {

        // Method overriding in Inheritance
        Parent parent = new Parent();
        Child child = new Child();

        parent.execute();
        child.execute();

        // Method inheritance in Runtime Polymorphism
        Concrete concrete = new Concrete();

        concrete.execute();
    }
}
