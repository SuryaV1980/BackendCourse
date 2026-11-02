package com.java.Assignment2;

public class SkipMultiples {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}