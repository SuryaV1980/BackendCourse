package com.java.assignment;

public class ElectricityBill {

    int units;

    double calculateBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }
        return bill;
    }

    double addFixedCharge(double billAmount) {
        double finalBill = billAmount + 50;
        return finalBill;
    }

    void displayDetails(double energyCharge, double fixedCharge, double finalBill) {
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        eb.units = 250;

        double energyCharge = eb.calculateBill(eb.units);
        double finalBill = eb.addFixedCharge(energyCharge);
        double fixedCharge = 50;

        eb.displayDetails(energyCharge, fixedCharge, finalBill);
    }
}
