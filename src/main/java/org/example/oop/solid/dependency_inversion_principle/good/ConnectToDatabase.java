package org.example.oop.solid.dependency_inversion_principle.good;

public class ConnectToDatabase {

    public void connect(JdbcUrl jdbcUrl) {
        System.out.println("Connecting to " + jdbcUrl.get());
    }
}
