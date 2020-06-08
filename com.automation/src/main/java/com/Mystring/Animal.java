package com.Mystring;

public class Animal {
	
	static String a = "sarower";
	static String obj = new String ("rajon");
	static StringBuffer bufferobj = new StringBuffer("Suman");
	static StringBuilder builderObj  = new StringBuilder ("Dora");
	
	public static void main(String[] args) {
//		System.out.println(a.concat("sarower"));
//		System.out.println(obj.concat(" rajon ")); 
		System.out.println(a);
		System.out.println(obj);//immutable = change not possible == store in inside the Heap=> sting pool
		
		System.out.println(bufferobj);
		System.out.println(builderObj);// mutable = change possible ==> Heap
//		System.out.println(builderObj.append(" Ahamed"));// i have Question for sarower brother  when i use  append what kind method i will take from
		/// all so why i use one inside anther method
		
		
	}

}
