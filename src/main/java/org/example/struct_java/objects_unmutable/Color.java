package org.example.struct_java.objects_unmutable;

public enum Color {
    RED ("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green");

    private String name;
    Color(String name) {
        this.name =  name;
    }
}
