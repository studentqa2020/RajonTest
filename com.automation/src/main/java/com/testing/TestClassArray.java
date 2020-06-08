package com.testing;

import java.util.Arrays;

public class TestClassArray {

	
	public static void main(String[] args) {
		
		
		int [] a =  {88,66,55,100,33,44,22,11,99};
		int [] b =  {333,666,555,100,333,44,222,111,222};
		
		int [] c = new int [ a.length +b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b,0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
		
	}
}
