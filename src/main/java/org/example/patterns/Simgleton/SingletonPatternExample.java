package org.example.patterns.Simgleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        Captain captain1 = Captain.getCaptain();
        Captain captain2 = Captain.getCaptain();
        if(captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance");
        }

        Captain.CaptainDerived derived = captain1.new CaptainDerived();
        Captain.dummyMethod();
    }
}
