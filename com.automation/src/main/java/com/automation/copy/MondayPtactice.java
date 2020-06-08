package com.automation.copy;

public class MondayPtactice {
    //instance variable is under globle = b value = 20
	//int b =20
	static int c;
	static int d;
	
	
	//instance variable = c 
	void  getsalary(int a,int b) {
	
	//local variable = a & value = 10 
		//int a;// declaration
		//
	
		 c =a+b;
		 d = b+a;
		 System.out.println(c);
		 System.out.println(d);
}
	public static void main(String[] args) {
		
		 MondayPtactice obj = new  MondayPtactice();
		 obj.getsalary(c, d);
		
	}
}
