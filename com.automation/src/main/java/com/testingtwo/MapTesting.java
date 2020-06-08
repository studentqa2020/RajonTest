package com.testingtwo;

import java.util.Hashtable;

import java.util.HashMap;
import java.util.Map;

public class MapTesting {
	
	
	public static void main(String[] args) {
		// Sky = Blue, Sun = red, Tree= Green.... Map & print
		//print .... Key
		//print ... value
		//print.. Tree
		
//		Map <String,String> myMap = new HashMap<>();
//		
//		myMap.put(" Ske", "Blue");
//		myMap.put(" Sun", " Red");
//		myMap.put("Tree", " Green");
//		
//		System.out.println(myMap.keySet());
//		System.out.println(myMap.values());
//		System.out.println(myMap.get(" Tree"));
		
		
		
		//Map <String,Double> MyMap = new HashMap<>();
		Map <String,Double> MyMap = new Hashtable<>();
		MyMap.put("Milk", 3.99);
		MyMap.put("Egg", 1.99);
		MyMap.put("Meat", 3.99);
		MyMap.put("Fish", 3.99);
		System.out.println(MyMap.entrySet());
//		System.out.println(MyMap.keySet());
//		System.out.println(MyMap.values());
//		System.out.println(MyMap.get(" Egg"));
			
	}

}
