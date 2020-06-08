package com.automation;

public class AnimalOne {
	
	
	
	public void getsalary(){

		System.out.println(" We need help Each other to protech ourself");
}
	
	
	public static void getmoney(){
		
		System.out.println("I want some money");
	}
	
	int getincome(){
		
		return 500;
		
		
	}
	public static void main(String[] args) {
		AnimalOne obj = new AnimalOne();
		
				obj.getsalary();
		obj.getincome();
		AnimalOne.getmoney();
		System.out.println(obj.getincome());
		
	}
		
	}
