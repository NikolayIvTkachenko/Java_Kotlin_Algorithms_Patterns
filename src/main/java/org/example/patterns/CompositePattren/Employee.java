package org.example.patterns.CompositePattren;

public class Employee implements IEmployee {

    private String name;
    private String dept;
    private int employeeCount=0;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t"+this.name+ " works in " + this.dept);
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
}
