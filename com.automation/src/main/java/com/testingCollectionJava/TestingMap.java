package com.testingCollectionJava;

import java.util.HashMap;
import java.util.Map;

public class TestingMap{
	
	public static void main(String[] args) {
		
		//key is Name
		//Value is == Rajon
		
		Map<String,String> myMap = new HashMap<>();
		myMap.put("Name", "Rajon");
		myMap.put("Age", "25");
		myMap.put(" Join Date", "02/03/2020");
		myMap.put("Phone", "7189159001");
		
		System.out.println(myMap.entrySet());
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.get("Phone"));	
	} 
}
	


