package com.testingtwo;

import java.util.HashSet;
import java.util.Set;

public class TestingArraysThusday {

	public static void main(String[] args) {
		Set<Integer>mySet = new HashSet <>();
		int [] myArray = {2,3,4,5,6,2,3};
		
		//System.out.println(myArray.toString());
	
		for ( int i =0; i<myArray.length; i++){
			
			System.out.println(myArray[i]);
			mySet.add(myArray[i]);
			
		}
		
		System.out.println(mySet);
	}	
}
