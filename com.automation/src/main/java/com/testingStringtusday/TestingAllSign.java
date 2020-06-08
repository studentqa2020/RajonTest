package com.testingStringtusday;

public class TestingAllSign {
	
	public static void main(String[] args) {
		

		String a = " UNITED 123 STATE4% OF // AMERICA 2458#$%";
		
		
		//System.out.println(a.replaceAll("\\d", "")); // remove all number
		//System.out.println(a.replaceAll("\\D", "")); // remove all letter + sign
		//System.out.println(a.replaceAll("\\s", "")); // remove all empty space
		//System.out.println(a.replaceAll("\\w", "")); // remove all letter + number
		//System.out.println(a.replaceAll("\\W", "")); // remove all special sign ******
		//System.out.println(a.replaceAll("[a-zA-Z_0-9]", "")); // remove all letter + number
		//System.out.println(a.replaceAll("[a-zA-Z]", "")); // remove only letters
		//System.out.println(a.replaceAll("[0-9]", "")); //only number
		
		System.out.println(a.replaceAll("\\d", "").replaceAll("\\w", "")); 
		
		
		
	}

}
