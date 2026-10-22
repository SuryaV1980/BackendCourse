package com.javaExercise;

public class BackAccount {
	int accountnumber;
	String name;
	int balance;
BackAccount(){
	accountnumber = 0;
	name = "unknown";
	balance = 0;
}
	void displayAccount() {
		System.out.println("Account Number : " + accountnumber);
		System.out.println("Name : " + name);
		System.out.println("Balance :" + balance);
		
	}
	

	public static void main(String[] args) {
		
		BackAccount obj = new BackAccount();
		BackAccount obj1 = new BackAccount();
		BackAccount obj2 = new BackAccount();
		
	
		obj.displayAccount();
		obj1.displayAccount();
		obj2.displayAccount();

	}

}
