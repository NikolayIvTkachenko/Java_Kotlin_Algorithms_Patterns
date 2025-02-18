package org.example.patterns.InterpreterPattern;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private int yearOfExperience;
    private List<String> permissibleGrades;

    public Context(int experience, String... allowedGrades) {
        this.yearOfExperience = experience;
        this.permissibleGrades = new ArrayList<>();

        for(String grade: allowedGrades) {
            permissibleGrades.add(grade);
        }
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }
}
