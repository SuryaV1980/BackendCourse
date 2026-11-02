package com.java.Assignment2;

class Employee {
    String name;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDeveloper() {
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void displayTester() {
        displayDetails();
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Kim Min-jun";
        dev.salary = 40000;
        dev.programmingLanguage = "Java";

        Tester test = new Tester();
        test.name = "Park Seo-yeon";
        test.salary = 35000;
        test.testingTool = "Selenium";

        dev.displayDeveloper();
        System.out.println();

        test.displayTester();
    }
}