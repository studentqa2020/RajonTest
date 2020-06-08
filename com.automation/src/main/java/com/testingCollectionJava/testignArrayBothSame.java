package com.testingCollectionJava;

import java.util.Arrays;

public class testignArrayBothSame {
	
	
	public static void main(String[] args) {
		
		
		int [] a = {2,3,4,5,6};
		int [] b = { 7,8,9,10};
		
		
//		int firstArraysTotalno = a.length;
//		int secesonArraysTotalNo = b.length;
//		//or
//		System.out.println(a.length);
//		System.out.println(b.length);
							//[5+4]
		int [] c = new int [a.length+b.length];
		
		for (int i= 0; i<a.length; i++) {
			c[i]=a [i];
		}
	
		System.out.println(" this is my Array C and only copy a =" + Arrays.toString(c));
		for ( int i=0; i<b.length; i++) {
			c[a.length+i]=b[i];
			
		}
		System.out.println("This is my Array C and only copy a & b both = "+ Arrays.toString(c));
	}
	}


