package org.example.patterns.Builder;

public interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();
    Product getVehicle();
}
