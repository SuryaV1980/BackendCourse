package com.java.assignment;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements:");

        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }

        int smallest = arr[0];

        for (int a = 1; a < n; a++) {
            if (arr[a] < smallest) {
                smallest = arr[a];
            }
        }

        System.out.println("Smallest Element = " + smallest);

        sc.close();
    }
}
