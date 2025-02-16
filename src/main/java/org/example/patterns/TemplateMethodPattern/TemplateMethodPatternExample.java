package org.example.patterns.TemplateMethodPattern;

public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Template Method Pattern Demo ***\n");

        BasicEngineering preferredCourse = new ComputerScience();
        System.out.println("Computer Sc. course will be completed in following order: ");
        preferredCourse.completeCourse();
        System.out.println("");

        preferredCourse = new Electronics();
        System.out.println("Electronics course will be completed in following order: ");
        preferredCourse.completeCourse();
    }
}
