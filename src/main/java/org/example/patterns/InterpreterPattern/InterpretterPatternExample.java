package org.example.patterns.InterpreterPattern;

public class InterpretterPatternExample {
    public static void main(String[] args) {

        System.out.println("*** Interpreter Pattern Demo ***\n");
        Context context = new Context(10, "G2", "G3");

        Employee emp1 = new IndividualEmployee(5, "G1");
        Employee emp2 = new IndividualEmployee(10, "G2");
        Employee emp3 = new IndividualEmployee(15, "G3");
        Employee emp4 = new IndividualEmployee(20, "G4");

        EmployeeBuilder builder = new EmployeeBuilder();

        System.out.println("emp1 is eligible for promotion. " + emp1.interpret(context));
        System.out.println("emp2 is eligible for promotion. " + emp2.interpret(context));
        System.out.println("emp3 is eligible for promotion. " + emp3.interpret(context));
        System.out.println("emp4 is eligible for promotion. " + emp4.interpret(context));

        System.out.println("emp1 or emp3 =  " + builder.buildExpression(emp1, "Or", emp3).interpret(context));
        System.out.println("emp2 or emp4 =  " + builder.buildExpression(emp2, "And", emp4).interpret(context));
        System.out.println("emp3 =  " + builder.buildExpression(emp1, "Not", null).interpret(context));


    }
}
