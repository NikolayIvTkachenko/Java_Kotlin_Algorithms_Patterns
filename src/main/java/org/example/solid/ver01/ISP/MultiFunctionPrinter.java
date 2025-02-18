package org.example.solid.ver01.ISP;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    public void faxDocument() {
        System.out.println("Faxing document...");
    }
}
