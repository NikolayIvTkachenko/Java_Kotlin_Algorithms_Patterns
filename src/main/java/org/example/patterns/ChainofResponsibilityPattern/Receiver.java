package org.example.patterns.ChainofResponsibilityPattern;

public interface Receiver {
    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReceiver);
}
