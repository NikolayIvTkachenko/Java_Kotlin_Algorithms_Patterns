package org.example.patterns.ProxyPattern;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("DoSomeWork() inside ConcreteSubject is invoked.");
    }
}
