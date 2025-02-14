package org.example.patterns.ProxyPattern;

public class ProxyV3PatternExample {
    public static void main(String[] args) {
        System.out.println("***ProxyV3 Pattern Demo without lazy instantiation***\n");
        ProxyV3 px = new ProxyV3();
        px.doSomeWork();

        ProxyV3 px2 = new ProxyV3();
        px2.doSomeWork();

        System.out.println("Instance Count = " + ProxyV3.count);
    }
}
