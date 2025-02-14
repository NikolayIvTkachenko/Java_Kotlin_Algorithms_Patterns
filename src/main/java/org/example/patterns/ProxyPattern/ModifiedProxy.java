package org.example.patterns.ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ModifiedProxy extends Subject {

    static Subject cs;
    String currentUser;
    List<String> registeredUsers;

    public ModifiedProxy(String currentUser) {
        registeredUsers = new ArrayList<String>();
        registeredUsers.add("Admin");
        registeredUsers.add("Rohit");
        registeredUsers.add("Sam");
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork() {
        System.out.println("\n Proxy call happening now...");
        System.out.println(currentUser+" wants to invoke a proxy method.");

        if(registeredUsers.contains(currentUser)) {
            if(cs == null) {
                cs = new ConcreteSubject();
            }
            cs.doSomeWork();
        } else {
            System.out.println("Sorry " + currentUser + " , you do not have access rights.");
        }
    }
}
