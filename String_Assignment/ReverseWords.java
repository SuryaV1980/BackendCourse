package com.java.Assignment2;

public class ReverseWords {

    public static void main(String[] args) {

        String input = "Java is easy";
        String[] words = input.split(" ");

        for (int a = 0; a < words.length; a++) {

            for (int b = words[a].length() - 1; b >= 0; b--) {
                System.out.print(words[a].charAt(b));
            }

            if (a < words.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
//Write a Java program to reverse each word in a sentence without changing the order of the words.
//
//Input: Java is easy
//
//Expected Output: avaJ si ysae
