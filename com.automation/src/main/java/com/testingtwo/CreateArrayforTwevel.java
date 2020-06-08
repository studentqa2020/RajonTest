package com.testingtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateArrayforTwevel {

	
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40};
		
		List<Integer>myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		System.out.println(myList);
		
		for (int i =0; i <myList.size(); i++) {
			System.out.println(myList.get(i));
			
		}
		
		int maxNumber = Collections.max(myList);
		System.out.println( " Max number is =" +maxNumber);
		
		int minNumber = Collections.max(myList);
		System.out.println( " Max number is =" +minNumber);
		
		
		
		
	}
}
