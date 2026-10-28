package com.java.assignment;

import java.util.Scanner;

public class NumberCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements:");

        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int a = 0; a < n; a++) {
            if (arr[a] > 0) {
                positive++;
            } else if (arr[a] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
        System.out.println("Zeros = " + zero);

        sc.close();
    }
}
