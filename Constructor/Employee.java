package com.javaExercise;

public class Employee {
	 int employeeId;
	 String employeeName;
	 double salary;

	 Employee(int employeeId, String employeeName,double salary){
		 this.employeeId   = employeeId;
		 this.employeeName = employeeName;
		 this.salary 	   = salary;
	 }
	 void calculateAnnualSalary() {
		 double annualSalary = salary * 12;
		 System.out.println("employee Id : "   		 + employeeId);
		 System.out.println("employee Name : " 		 + employeeName);
		 System.out.println("salary : "       		 + salary);
		 System.out.println("Annual Salary : "       + annualSalary);
		 
	 }
	 
	public static void main(String[] args) {
		Employee Emp1  = new Employee(101, "Kim chae-young", 20001);
		Employee Emp2 = new Employee(102, "Lee Ji-min"    , 30001);
		Employee Emp3 = new Employee(103, "Kim Chae-won"  , 40001);
		
		Emp1.calculateAnnualSalary();
		Emp2.calculateAnnualSalary();
		Emp3.calculateAnnualSalary();

	}

}
