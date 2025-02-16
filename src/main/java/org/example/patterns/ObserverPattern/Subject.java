package org.example.patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface {

    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notofyRegisteredUsers(flag);
    }

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(
                anObserver
        );
    }

    @Override
    public void notofyRegisteredUsers(int notifiedValue) {
        for(Observer observer: observerList) {
            observer.update(notifiedValue);
        }
    }
}
