package com.java.Assignment2;
public class LoginAttempt {

    public static void main(String[] args) {
        String correctPassword = "java123";
        String enteredPassword = "something";

        int attempts = 1;

        while (attempts <= 3) {
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Password");
            }

            attempts++;
        }
    }
}
