package org.example.patterns.ObserverPattern;

public interface SubjectInterface {
    void register(Observer anObserver);
    void unregister(Observer anObserver);
    void notofyRegisteredUsers(int notifiedValue);
}
