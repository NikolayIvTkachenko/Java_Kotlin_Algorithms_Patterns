package org.example.solid.ver01.OSP.before;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}
