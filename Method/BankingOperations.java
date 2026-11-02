package com.java.assignment;

public class BankingOperations {

    double InitialBalance;
    double DepositAmount;
    double WithdrawalAmount;

    double deposit(double Balance, double DepositAmount) {
        double UpdatedBalance = Balance + DepositAmount;
        return UpdatedBalance;
    }

    double withdraw(double Balance, double WithdrawalAmount) {
        if (Balance >= WithdrawalAmount) {
            Balance = Balance - WithdrawalAmount;
        } 
        else {
            System.out.println("Insufficient Balance");
        }

        return Balance;
    }

    void checkBalance(double Balance) {
        System.out.println("Current Balance: " + Balance);
    }

    void displayTransactionSummary(double DepositAmount, double WithdrawalAmount, double FinalBalance) {
        System.out.println("Deposited: " + DepositAmount);
        System.out.println("Withdrawn: " + WithdrawalAmount);
        System.out.println("Final Balance: " + FinalBalance);
    }

    public static void main(String[] args) {
        BankingOperations Bank = new BankingOperations();

        Bank.InitialBalance = 5000;
        Bank.DepositAmount = 2000;
        Bank.WithdrawalAmount = 1500;

        System.out.println("Initial Balance: " + Bank.InitialBalance);

        double Balance = Bank.deposit(
            Bank.InitialBalance, Bank.DepositAmount
        );

        Balance = Bank.withdraw(Balance, Bank.WithdrawalAmount);

        Bank.checkBalance(Balance);

        Bank.displayTransactionSummary(
            Bank.DepositAmount, Bank.WithdrawalAmount, Balance
        );
    }
}
