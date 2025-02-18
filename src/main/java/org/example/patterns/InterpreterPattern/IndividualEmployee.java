package org.example.patterns.InterpreterPattern;


public class IndividualEmployee implements Employee {

    private int yearOfExperience;
    private String currentGrade;

    public IndividualEmployee(int yearOfExperience, String grade) {
        this.yearOfExperience = yearOfExperience;
        this.currentGrade = grade;
    }

    @Override
    public boolean interpret(Context context) {
        if(this.yearOfExperience >= context.getYearOfExperience()
                && context.getPermissibleGrades().contains(this.currentGrade)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "IndividualEmployee{" +
                "yearOfExperience=" + yearOfExperience +
                ", currentGrade='" + currentGrade + '\'' +
                '}';
    }
}
