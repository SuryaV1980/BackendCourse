package com.java.Assignment2;

public class DuplicateCharacter {

    public static void main(String[] args) {

        String Input = "Programming";
        String Output = "";

        for (int a = 0; a < Input.length(); a++) {

            boolean found = false;

            for (int b = 0; b < Output.length(); b++) {
                if (Input.charAt(a) == Output.charAt(b)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                Output += Input.charAt(a);
            }
        }

        System.out.println(Output);
    }
}
//Write a Java program to remove duplicate characters while maintaining the original order.
//
//Input: programming
//
//Expected Output: progamin
	
