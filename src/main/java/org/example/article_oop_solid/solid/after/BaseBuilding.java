package org.example.article_oop_solid.solid.after;

public abstract class BaseBuilding {
    protected String nameOfBuilding;
    protected String typeOfBuilding;

    public BaseBuilding(String name, String typeOfBuilding) {
        this.nameOfBuilding = name;
        this.typeOfBuilding = typeOfBuilding;
    }

    public String getNameOfBuilding() {
        return nameOfBuilding;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }
}
