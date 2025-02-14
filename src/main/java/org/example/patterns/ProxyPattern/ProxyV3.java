package org.example.patterns.ProxyPattern;

public class ProxyV3 extends Subject{
    static Subject cs;
    static int count=0;

    public ProxyV3() {
        cs = new ConcreteSubject();
        count++;
    }


    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() => Proxy call happening now...");
        cs.doSomeWork();
    }
}
