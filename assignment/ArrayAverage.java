
package com.java.assignment;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements:");

        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }

        int sum = 0;

        for (int a = 0; a < n; a++) {
            sum = sum + arr[a];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
