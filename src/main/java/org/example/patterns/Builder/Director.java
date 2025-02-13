package org.example.patterns.Builder;

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
