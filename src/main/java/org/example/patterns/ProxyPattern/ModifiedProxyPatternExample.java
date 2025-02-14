package org.example.patterns.ProxyPattern;

public class ModifiedProxyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Modified Proxy Pattern Demo without lazy instantiation***\n");
        ModifiedProxy px = new ModifiedProxy("Admin");
        px.doSomeWork();

        ModifiedProxy px2 = new ModifiedProxy("Robin");
        px2.doSomeWork();

        System.out.println("End ");
    }
}
