package com.java.Assignment2;
public class StudentGrade {

    void calculateGrade(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();

        double marks = 84;
        sg.calculateGrade(marks);
    }
}