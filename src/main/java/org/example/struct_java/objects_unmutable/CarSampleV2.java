package org.example.struct_java.objects_unmutable;

import java.util.Objects;

public class CarSampleV2 {
    private final String name;
    private final Color color;

    public CarSampleV2(String name, Color color) {
        this.name = CheckObject.requireNonNullElseThrow(name, new UnsupportedOperationException("Name cannot be null"));
        this.color = CheckObject.requireNonNullElseThrow(color, new UnsupportedOperationException("Locale cannot be null"));
    }

    @Override
    public String toString() {
        return "CarSample{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
