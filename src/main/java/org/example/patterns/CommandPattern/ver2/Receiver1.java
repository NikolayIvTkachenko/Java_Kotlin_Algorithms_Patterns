package org.example.patterns.CommandPattern.ver2;

public class Receiver1 implements Receiver {

    private int testNumber;

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public Receiver1() {
        testNumber = 10;
        System.out.println("Receiver1 initialized with " + testNumber);
        System.out.println("The objects of receiver1 cannot set beyond " + testNumber);
    }

    @Override
    public void performDo() {
        System.out.println("Received an addition request.");
        int presentNumber = getTestNumber();
        setTestNumber(presentNumber + 2);
        System.out.println(presentNumber + " + 2 = " + this.testNumber);
    }

    @Override
    public void performUnDo() {
        System.out.println("Received an undo addition request.");
        int presentNumber = this.testNumber;
        if(presentNumber > 10) {
            setTestNumber(this.testNumber - 2);
            System.out.println(presentNumber + " - 2 = " + this.testNumber);
            System.out.println("\t Undo request processed.");
        } else {
            System.out.println("Nothing more to undo...");
        }
    }
}
