package com.java.assignment;

public class ShoppingCart {

    double item1;
    double item2;
    double item3;
    String membership;

    double calculateTotal(double p1, double p2, double p3) {
        double total = p1 + p2 + p3;
        return total;
    }

    double calculateDiscount(double total, String membership) {
        double discount = 0;
        if (membership.equalsIgnoreCase("Gold")) {
            discount = total * 0.20;
        } else if (membership.equalsIgnoreCase("Silver")) {
            discount = total * 0.10;
        } else if (membership.equalsIgnoreCase("Regular")) {
            discount = total * 0.05;
        }
        return discount;
    }

    double calculateFinalAmount(double total, double discount) {
        double finalAmount = total - discount;
        return finalAmount;
    }

    void displayDetails(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.item1 = 2000;
        cart.item2 = 1500;
        cart.item3 = 500;
        cart.membership = "Gold";

        double total = cart.calculateTotal(cart.item1, cart.item2, cart.item3);
        double discount = cart.calculateDiscount(total, cart.membership);
        double finalAmount = cart.calculateFinalAmount(total, discount);

        cart.displayDetails(total, discount, finalAmount);
    }
}
