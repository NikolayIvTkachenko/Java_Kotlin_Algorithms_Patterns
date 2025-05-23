package org.example.oop.solid.dependency_inversion_principle;

public class App {
    public static void main(String[] args) {

        System.out.println("\nApproach that doesn't follow DIP:\n");

        org.example.oop.solid.dependency_inversion_principle.bad.PostgreSQLJdbcUrl p1
                = new org.example.oop.solid.dependency_inversion_principle.bad.PostgreSQLJdbcUrl("my_db");
        org.example.oop.solid.dependency_inversion_principle.bad.ConnectToDatabase c1
                = new org.example.oop.solid.dependency_inversion_principle.bad.ConnectToDatabase();

        c1.connect(p1);

        System.out.println("\nApproach that follow ISP:\n");

        org.example.oop.solid.dependency_inversion_principle.good.PostgreSQLJdbcUrl p2
                = new org.example.oop.solid.dependency_inversion_principle.good.PostgreSQLJdbcUrl("my_db");
        org.example.oop.solid.dependency_inversion_principle.good.MySQLJdbcUrl p3
                = new org.example.oop.solid.dependency_inversion_principle.good.MySQLJdbcUrl("my_db");

        org.example.oop.solid.dependency_inversion_principle.good.ConnectToDatabase c2
                = new org.example.oop.solid.dependency_inversion_principle.good.ConnectToDatabase();

        c2.connect(p2);
        c2.connect(p3);
    }
}
