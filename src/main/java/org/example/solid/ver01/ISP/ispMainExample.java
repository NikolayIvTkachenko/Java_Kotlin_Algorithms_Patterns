package org.example.solid.ver01.ISP;

public class ispMainExample {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.printDocument();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}
