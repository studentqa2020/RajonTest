package com.testingtwo;

import java.util.Arrays;

public class testingClassfortwlevel {

	public static void main(String[] args) {
//		i) write an array
//        ii) print it 
//        iii) Loop it
//        iv) Max or Min
	
	 int [] a ={6,8,7,4,5,3,2,9 };
	
	System.out.println(Arrays.toString(a));
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	
	
	int maxNumber = Arrays.stream(a).max().getAsInt();
	System.out.println(" MIx number ="+maxNumber);
	
	int minNumber = Arrays.stream(a).min().getAsInt();
	System.out.println(" MIN number ="+minNumber);
	}	
}
