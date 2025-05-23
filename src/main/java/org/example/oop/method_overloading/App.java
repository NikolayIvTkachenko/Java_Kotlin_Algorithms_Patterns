package org.example.oop.method_overloading;

public class App {
    public static void main(String[] args) {

        Foo foo = new Foo();

        foo.foozzy("text", 1);
        foo.foozzy(1, "text");
        foo.foozzy(-1, 1);
        foo.foozzy("text", -1, 1);
    }
}
