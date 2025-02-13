package org.example.patterns.Builder;

public final class ProductClass {

    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadLights;
    private String endOperationsMessage;

    public ProductClass(final String startUpMessage, String bodyType, int noOfWheels, int noOfHeadLights, String endOperationsMessage) {
        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadLights = noOfHeadLights;
        this.endOperationsMessage = endOperationsMessage;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "startUpMessage='" + startUpMessage + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfHeadLights=" + noOfHeadLights +
                ", endOperationsMessage='" + endOperationsMessage + '\'' +
                '}';
    }
}
