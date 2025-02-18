package org.example.solid.ver01.OSP.before;

public class RegularDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}
