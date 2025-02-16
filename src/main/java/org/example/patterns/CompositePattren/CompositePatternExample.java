package org.example.patterns.CompositePattren;

public class CompositePatternExample {
    public static void main(String[] args) {

        System.out.println("***   ***");
        Employee mathTeacher1 = new Employee("Math Teacher-1", "Maths");
        Employee mathTeacher2 = new Employee("Math Teacher-2", "Maths");

        Employee cseTeacher1 = new Employee("CSE Teacher-1", "Computer Sc.");
        Employee cseTeacher2 = new Employee("CSE Teacher-2", "Computer Sc.");
        Employee cseTeacher3 = new Employee("CSE Teacher-3", "Computer Sc.");

        CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD-Maths)", "Maths");
        CompositeEmployee hodCompSc = new CompositeEmployee("Mr.V.Sarcar(HOD-CSE)", "Computer Sc.");
        CompositeEmployee principal = new CompositeEmployee("Dr.S.Som (Principal)", "Planning-Supervising-Managing");

        hodMaths.addEmployee(mathTeacher1);
        hodMaths.addEmployee(mathTeacher2);

        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);

        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCompSc);

        System.out.println("\n Testing the structure of a Principal object");
        principal.printStructures();
        System.out.println("\n At present Principal has control over " + principal.getEmployeeCount() + " number of employees.");

        System.out.println("\n Testing the structure of a HOD_CSE object: ");
        hodCompSc.printStructures();
        System.out.println("\n At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees.");

        System.out.println("\n Testing the structure of a HOD_Maths object: ");
        hodMaths.printStructures();
        System.out.println("At present Hod-Maths has controls over " + hodMaths.getEmployeeCount() + " number of employees.");

        //Leaf node
        System.out.println("\n Testing the structure of a leaf node:");
        mathTeacher1.printStructures();
        System.out.println("At present Maths Teacher-1 has controls over " + mathTeacher1.getEmployeeCount() + " number of employees.");

        hodCompSc.removeEmployee(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");

        principal.printStructures();
        System.out.println("At present Maths Principal has controls over " + mathTeacher1.getEmployeeCount() + " number of employees.");

        System.out.println("At present Maths HOD-CSE has controls over " + hodCompSc.getEmployeeCount() + " number of employees.");

        System.out.println("At present Maths HOD_Maths has controls over " + hodMaths.getEmployeeCount() + " number of employees.");

    }
}
