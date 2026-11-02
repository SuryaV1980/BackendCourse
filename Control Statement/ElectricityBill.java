package com.java.Assignment2;

public class ElectricityBill {

    double calculateBill(double units) {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        return bill;
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        double units = 250;
        double bill = eb.calculateBill(units);

        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + bill);
    }
}