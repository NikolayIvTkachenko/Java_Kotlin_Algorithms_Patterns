package org.example.struct_java.objects_unmutable;

import java.util.Objects;

public class CarSample {

    private final String name;
    private final Color color;

    public CarSample(String name, Color color) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.color = Objects.requireNonNull(color, "Locale cannot be null");
    }

    @Override
    public String toString() {
        return "CarSample{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
