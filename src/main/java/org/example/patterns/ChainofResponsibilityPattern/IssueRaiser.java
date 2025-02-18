package org.example.patterns.ChainofResponsibilityPattern;

public class IssueRaiser {
    public Receiver setFirtsReceiver;
    public void setFirstErrorHandler(Receiver firstErrorHandler) {
        this.setFirtsReceiver = firstErrorHandler;
    }

    public void raiseMessage(Message message) {
        if(setFirtsReceiver != null) {
            setFirtsReceiver.handleMessage(message);
        }
    }

}
