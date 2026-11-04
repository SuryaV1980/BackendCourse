package com.java.Assignment2;

public class FindString {
	public static void main(String[] args) {
		String Input = "swiss";

		for (int a = 0; a < Input.length(); a++) {
			char ch = Input.charAt(a);
			boolean isRepeated = false;

			for (int b = 0; b < Input.length(); b++) {
				if (a != b && Character.toLowerCase(ch) == Character.toLowerCase(Input.charAt(b))) {
					isRepeated = true;
					break;
				}
			}

			if (!isRepeated) {
				System.out.println(ch);
				break;
			}
		}
	}
}
//Q1. First Non-Repeated Character
//
//Write a Java program to find the first character that appears only once in a String.
//
//Input: swiss
//
//Expected Output: w
