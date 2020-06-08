package com.automation;

public abstract class Student {
	static int a;

	void getsalary(){
		a = 10;
		System.out.println(a);
	}
	
	String getmoney() {
		System.out.println(a);
		return "corona";
	}
	static void getcome() {
		System.out.println(a);
		
	}
	static int getfood() {
		System.out.println(a);
		return 10;
	}
	
	abstract void getrun();
	
	private void syso() {
		// TODO Auto-generated method stub
		

	}
		
	
	
}
