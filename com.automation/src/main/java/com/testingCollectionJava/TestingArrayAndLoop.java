package com.testingCollectionJava;

import java.util.Arrays;

public class TestingArrayAndLoop {

	
	public static void main(String[] args) {
		
		//10,20,30,40,50,60;70,80,90,100 = array and loop it
		//zero position = a a[]
		//last position 10 = index 9 = ( total position - 1)==> a [a.length-1]
		// print without loop
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println( " This is my zore position Number "+a[0]);
		System.out.println(" this is last positin " +a[a.length-1]);
		
		System.out.println(" This is call without loop "+Arrays.toString(a));
		
	}
}
