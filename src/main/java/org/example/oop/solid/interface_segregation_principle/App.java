package org.example.oop.solid.interface_segregation_principle;

public class App {
    public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow ISP:\n");

        org.example.oop.solid.interface_segregation_principle.bad.WwwPingConnection www1
                = new org.example.oop.solid.interface_segregation_principle.bad.WwwPingConnection("www.yahoo.com");

        www1.http();
        www1.socket(); // this method doesn't do anything, but the client doesn't know that
        www1.connect();

        System.out.println("\nApproach that follow ISP:\n");

        org.example.oop.solid.interface_segregation_principle.good.WwwPingConnection www2
                = new org.example.oop.solid.interface_segregation_principle.good.WwwPingConnection("www.yahoo.com");

        www2.http();
        www2.connect();
    }
}
