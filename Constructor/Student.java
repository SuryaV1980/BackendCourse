
package com.javaExercise;

public class Student {
    int studentId;
    String studentName;
    String course;

    void displayDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayDetails();
        
    }
}
