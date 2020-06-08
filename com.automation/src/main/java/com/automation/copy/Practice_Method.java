package com.automation.copy;

public class Practice_Method {

	public static int a = 10;// static
	public static int b = 20;
	public static int c;

	public int getmoney() {

		a = 5;
		c = a + b;
		return c;
	}

	public static void getsalary() {

		c = b - a;
		System.out.println(c);
	}
}