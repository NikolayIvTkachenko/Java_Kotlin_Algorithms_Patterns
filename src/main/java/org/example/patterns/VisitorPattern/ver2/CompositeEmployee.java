package org.example.patterns.VisitorPattern.ver2;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {

    private String name;
    private String dept;
    private int yearsOfExperience;
    private List<Employee> controls;

    public CompositeEmployee(String name, String dept, int experience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
        controls = new ArrayList<Employee>();
    }

    public void addEmployee(Employee e) {
        controls.add(e);
    }

    public void removeEmployee(Employee e) {
        controls.remove(e);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<Employee> getControls() {
        return controls;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + " Experience : " + getYearsOfExperience() + " years");
        for(Employee e: controls) {
            e.printStructures();
        }
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
