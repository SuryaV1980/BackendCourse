
package com.java.Assignment2;

public class ATM {

    int CorrectPIN;
    int EnteredPIN;
    double Balance;
    double WithdrawalAmount;

    void withdraw(int EnteredPIN, double Balance, double WithdrawalAmount) {
        if (EnteredPIN == CorrectPIN) {
            if (Balance >= WithdrawalAmount) {
                Balance = Balance - WithdrawalAmount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance: " + Balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.CorrectPIN = 1234;
        atm.EnteredPIN = 1234;
        atm.Balance = 5000;
        atm.WithdrawalAmount = 2000;

        atm.withdraw(atm.EnteredPIN, atm.Balance, atm.WithdrawalAmount);
    }
}
