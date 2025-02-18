package org.example.patterns.ChainofResponsibilityPattern;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        System.out.println("\n*** Chain of responsibility Pattern Demo ***\n");
        Receiver faxHandler, emailHandler;

        IssueRaiser issueRaiser = new IssueRaiser();
        faxHandler = new FaxErrorHandler();
        emailHandler = new EmailErrorHandler();

        issueRaiser.setFirstErrorHandler(faxHandler);
        faxHandler.nextErrorHandler(emailHandler);
        emailHandler.nextErrorHandler(null);

        Message m1 = new Message("Fax is going slow.", MessagePriority.NORMAL);
        Message m2 = new Message("Email are not reaching..", MessagePriority.HIGH);
        Message m3 = new Message("In Email, CC field is disabled always.", MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reaching destinations.", MessagePriority.HIGH);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);

    }
}
