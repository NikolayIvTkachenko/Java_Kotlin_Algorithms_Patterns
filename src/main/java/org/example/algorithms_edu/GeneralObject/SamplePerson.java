package org.example.algorithms_edu.GeneralObject;

public class SamplePerson {

    private String lastName;
    private String firstName;
    private int age;

    public SamplePerson(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson() {
        System.out.print("  Last name: " + lastName);
        System.out.print("  First name: " + firstName);
        System.out.println(". Age: " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
