package com.automation;

public class TestingConstructor { ///1st class

	static String rajon;// null == can't handle any null value
	static int sarower = 10;
	static double k = 20.75;
	static boolean o = true;
	

  TestingConstructor(String rajon) {///2nd class
	this.rajon= rajon;
	
}
void getsalary(){
	System.out.println(100);
	
}
	public static void main(String[] args) {
		
		TestingConstructor obj = new TestingConstructor("rajon");
		obj.getsalary();

		System.out.println(rajon);
		System.out.println(sarower);
		System.out.println(k);
		System.out.println(o);
	}		
		
}		

	
	
	
