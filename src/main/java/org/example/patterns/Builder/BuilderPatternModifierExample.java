package org.example.patterns.Builder;

public class BuilderPatternModifierExample {

    public static void main(String[] args) {
        System.out.println("***Modifier Builder Pattern Demo***");

        final ProductClass customCar1 = new CarBuilder()
                .addHeadlights(5)
                .insertWheels(5)
                .buildBody("Plastic")
                .constructCar();

        System.out.println(customCar1);
        System.out.println("-------------");

        ModifiedBuilder carBuilder2 = new CarBuilder();
        final ProductClass customCar2 = carBuilder2.insertWheels(7)
                .addHeadlights(6)
                .startUpOperations("I am making my own car")
                .constructCar();

        System.out.println(customCar2);
        System.out.println("-------------");
        final ProductClass customCar3 = carBuilder2.getConstructedCar();
        System.out.println(customCar3);
    }

}
