package com.testingStringtusday;

public class TestongPallindrom {
	public static void main(String[] args) {
		
		
		String text = " MOM ";
		
		StringBuilder obj =new StringBuilder (text);
	
		if(text.equals(obj.reverse().toString())){
			
			System.out.println(" This is a pallindrom"); // true
		}else {
				
				System.out.println(" Not a pallindrom"); // false
	}
	}
}
