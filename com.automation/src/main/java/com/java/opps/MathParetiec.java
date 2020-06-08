package com.java.opps;

public class MathParetiec {
	
	static int a = 10;//20
	static int b = 20;//10
	
	// how do swap two variable
	public static void main(String[] args) {
		// a = a+b=30
		//b = 30-10
		//a = 30-b
		
		
		a =a+b;
		System.out.println(" A value="+a);
		System.out.println("B value ="+b);
		a=a+b;//30
		System.out.println("A value change to ="+a);
		b= a-b;
		System.out.println("B value change to"+b);
		System.out.println(" A vaule change to "+a);
		
	}
}
