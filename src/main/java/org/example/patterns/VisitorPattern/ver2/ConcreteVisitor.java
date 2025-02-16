package org.example.patterns.VisitorPattern.ver2;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitTheElement(CompositeEmployee employee) {
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 15 ? true : false;
        System.out.println("\t\t" + employee.getName() + " from " + employee.getDept() + " is eligible for promotion? " + eligibleForPromotion);
    }

    @Override
    public void visitTheElement(SimpleEmployee employee) {
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 12 ? true : false;
        System.out.println("\t\t" + employee.getName() + " from " + employee.getDept() + " is eligible for promotion? " + eligibleForPromotion);
    }
}
