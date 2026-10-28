package com.java.assignment;

import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements:");

        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int a = 0; a < n; a++) {
            if (arr[a] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers Count = " + even);
        System.out.println("Odd Numbers Count = " + odd);

        sc.close();
    }
}
