package com.testingtwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestingListRemoveNull {

	public static void main(String[] args) {
		//4,4,3,2,null,null == List
		//remove duplicate
		List<Integer> myList = new ArrayList<>();
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		
		System.out.println(myList);
		
		Set<Integer> mySet = new HashSet<>(myList);
		System.out.println(mySet);
		
		
	}
}


