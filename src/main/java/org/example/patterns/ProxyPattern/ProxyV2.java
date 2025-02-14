package org.example.patterns.ProxyPattern;

public class ProxyV2 extends Subject {

    static Subject cs;

    public ProxyV2() {
        System.out.println("Instantiating inside the constructor");
        cs = new ConcreteSubject();
    }

    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() => Proxy call happening now...");
        cs.doSomeWork();
    }

}
