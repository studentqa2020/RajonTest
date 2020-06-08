package com.testingStringtusday;

public class testingRemoveSignorDollSign {
	
	public static void main(String[] args) {
		
		
		//String a = "monday";
				//a.chars();
				
				
				//String name = new String ("rajon123$%#");
				
				
				//String b = name.replaceAll("\\d", " "); // remove the all letter
				//System.out.println(b);
				
				//or
				
				
				String a= " 10,442.75$ "; // remove the $ sign or , sign
				
				String value = a.replace("," , "").replace("$",  "");
				System.out.println(value);
		
		
		
		
	}

}
