package com.javaExercise;

public class StudentRecords {

    int rollNumber;
    String studentName;
    double marks;

    StudentRecords(int rollNumber, String studentName, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    StudentRecords(StudentRecords student) {
        this.rollNumber = student.rollNumber;
        this.studentName = student.studentName;
        this.marks = student.marks;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("                  ");
    }

    public static void main(String[] args) {

        StudentRecords s1 = new StudentRecords(101, "Arun", 85);
        StudentRecords s2 = new StudentRecords(s1);

        s2.marks = 95;

        System.out.println("Original Student:");
        s1.displayDetails();

        System.out.println("Copied Student:");
        s2.displayDetails();
    }
}
