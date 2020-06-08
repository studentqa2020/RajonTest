package com.testingtwo;

import java.util.Arrays;

public class ArraysTestingIndex {
	
	public static void main(String[] args) {
		
	int [] a = { 10,20,30};
	
	System.out.println(Arrays.toString(a));
	System.out.println(" This is my Arrays "+a.length);
	System.out.println(" my zero position "+a[1]);
	for(int i=0; i<a.length; i++) { 
	System.out.println(" This is my loop "+a[i]);
	
	}
	}
}