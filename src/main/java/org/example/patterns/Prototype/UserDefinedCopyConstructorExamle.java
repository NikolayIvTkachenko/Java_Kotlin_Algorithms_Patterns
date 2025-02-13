package org.example.patterns.Prototype;

public class UserDefinedCopyConstructorExamle {
    public static void main(String[] args) {
        System.out.println("***User defined copy constructor example in Java***");
        Student student1 = new Student(1, "John");
        System.out.println("The details of Student1 is as follows: ");
        student1.displayDetails();

        System.out.println("\n\nCopying student1 to student2 now");
        Student student2 = new Student(student1);
        System.out.println("The details of Student2 is as follows: ");
        student2.displayDetails();
    }
}
