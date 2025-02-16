package org.example.patterns.TemplateMethodPattern;

public abstract class BasicEngineering {
    public void completeCourse() {
        completeMath();;
        completeSoftSkills();
        completeSpecialPaper();
    }

    private void completeMath() {
        System.out.println("1.Mathematics");
    }

    private void completeSoftSkills() {
        System.out.println("2.SoftSkills");
    }
    public abstract void completeSpecialPaper();
}
