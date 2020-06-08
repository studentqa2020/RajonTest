package com.testingtwo;

public class Bobhan {

	public static void main(String[] args) {
		// Sting is immutable
		String a= (" SOBHAN ");
		String ab= (" ABDUS");
			
		StringBuffer Bufferobj = new StringBuffer (" ABDUS ");
		Bufferobj.append (" SOBHAN ");
	
		StringBuilder Builderobj = new StringBuilder (" Farhan ");
		Builderobj.append (" Raham ");
		
		System.out.println(Bufferobj);
		System.out.println(Builderobj);
		
	}
}
