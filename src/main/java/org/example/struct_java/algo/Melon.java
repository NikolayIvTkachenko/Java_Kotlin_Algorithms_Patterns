package org.example.struct_java.algo;

public class Melon {

    enum Sugar {
        LOW, MEDIUM, HIGH, UNKNOWN
    }
    private final String type;
    private final int weight;

    private Sugar sugar = Sugar.LOW;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public Melon(String type, int weight, Sugar sugar) {
        this.type = type;
        this.weight = weight;
        this.sugar = sugar;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", sugar=" + sugar +
                '}';
    }
}
