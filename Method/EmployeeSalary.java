package com.java.assignment;

public class EmployeeSalary {
	String EmployeeName;
	double basicSalary;
	double allowance;
	double deduction;
	
	double calculateSalary(double basicSalary, double allowance){
		double TotalSalary = basicSalary + allowance;
		return TotalSalary ;
	};
	double calculateNetSalary(double TotalSalary, double deduction){
		double NetSalary = TotalSalary - deduction;
		return NetSalary;
		
	};
	void displayDetails(){
		double TotalSalary = basicSalary + allowance;
		
		double NetSalary = TotalSalary - deduction;
		
		
		 System.out.println("Employee Name: "   + EmployeeName);
		 System.out.println("Employee Salary: " + TotalSalary);
		 System.out.println("Employee Net Salary: " + NetSalary);
	}
	public static void main(String[] args) {
		EmployeeSalary emp = new EmployeeSalary();
		
        emp.EmployeeName = "Yu Ji-Min";
        
        emp.basicSalary = 25000;
       
        emp.allowance = 5000;

        emp.deduction = 2000; 
        
        emp.displayDetails();

	}

}
