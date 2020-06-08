package com.automation;

public class PractieMethod {

	int a;//instance variable
	static int b;//static or class level
	
	void getsalary () {
		System.out.println( "This is my void method");
		a=10;
		b=20;
		int c=30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		
	}
	public static void main(String[] args) {
		PractieMethod obj = new PractieMethod();
				obj.getsalary();
	}
}






