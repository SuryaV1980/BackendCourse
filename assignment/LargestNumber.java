// Write a program to find the largest number in an array

package com.java.assignment;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
//		Read input from the keyboard
		Scanner sc = new Scanner(System.in);
		
//		Ask for the Array Size
		System.out.println("Enter the Array Size: ");
		int n = sc.nextInt();
//		Create a array 
		int[] arr = new int[n];
//		Ask for the element 
		System.out.println("Enter the Element: ");
//		Store each element in the array
		for(int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();	
		}
//		Logic
		int largest = arr[0];
		for(int a = 0; a < n; a++)
		{
			 if (arr[a] > largest) {
	                largest = arr[a];
	            }
		}
		 System.out.println("Largest Element = " + largest);

	        sc.close();

	}

}
