package org.example.patterns.Builder;

interface ModifiedBuilder {
    ModifiedBuilder startUpOperations(String startUpMessage);
    ModifiedBuilder buildBody(String bodyType);
    ModifiedBuilder insertWheels(int noOfWheels);
    ModifiedBuilder addHeadlights(int noOfHeadLights);
    ModifiedBuilder endOperations(String endOperationsMessage);
    ProductClass constructCar();
    ProductClass getConstructedCar();

}
