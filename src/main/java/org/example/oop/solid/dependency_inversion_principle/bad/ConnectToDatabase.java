package org.example.oop.solid.dependency_inversion_principle.bad;

public class ConnectToDatabase {

    public void connect(PostgreSQLJdbcUrl postgresql) {
        System.out.println("Connecting to " + postgresql.get());
    }
}
