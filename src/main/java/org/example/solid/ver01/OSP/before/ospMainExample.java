package org.example.solid.ver01.OSP.before;

public class ospMainExample {
    public static void main(String[] args) {
        Discount regularDiscount = new RegularDiscount();
        Discount premiumDiscount = new PremiumDiscount();

        DiscountCalculator calculator = new DiscountCalculator();

        double regularDiscountAmount = calculator.calculateDiscount(regularDiscount, 100);
        double premiumDiscountAmount = calculator.calculateDiscount(premiumDiscount, 100);

        System.out.println("Regular Discount: " + regularDiscountAmount);
        System.out.println("Premium Discount: " + premiumDiscountAmount);
    }
}
