package org.example.solid.ver01.OSP.before;

public class PremiumDiscount extends Discount {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
