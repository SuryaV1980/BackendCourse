package com.java.assignment;

public class StudentResult {
	String StudentName;
	double sub1;
	double sub2;
	double sub3;
	double sub4;
	double sub5;
	double TotalMark;
	double AverageMark;
	
	double calculateTotal(double sub1, double sub2, double sub3, double sub4, double sub5) {
		double TotalMark = sub1 + sub2 + sub3 + sub4 + sub5;
		return TotalMark ;
	}
    double calculateAverage(double total) {
        double averageMark = total / 5;
        return averageMark;
    }

    String calculateGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 75 && average < 90) {
            return "B";
        } else if (average >= 50 && average < 74) {
            return "C";
        } else {
            return "Fail";
        }
    }

    void displayDetails(double total, double average, String grade) {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
	public static void main(String[] args) {
		
		StudentResult StuResult = new StudentResult();
		
		StuResult.StudentName = "Kim Ji-woo";
		StuResult.sub1 = 85;
		StuResult.sub2 = 78;
		StuResult.sub3 = 92;
		StuResult.sub4 = 88;
		StuResult.sub5 = 77;
		
		double total = StuResult.calculateTotal(StuResult.sub1, StuResult.sub2, StuResult.sub3,
												StuResult.sub4, StuResult.sub5);

		double average = StuResult.calculateAverage(total);
		String grade = StuResult.calculateGrade(average);

		StuResult.displayDetails(total, average, grade);

		
	}

}
