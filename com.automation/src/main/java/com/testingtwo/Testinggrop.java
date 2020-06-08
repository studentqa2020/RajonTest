package com.testingtwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Testinggrop {
	
	public static void main(String[] args) {
		
		
		int[] a = {20,30,10};
		
		//List<Integer> myList = new ArrayList<>();
		//List<Integer> myList = new LinkedList<>();
		//List<Integer> myList = new Vector<>();
		List<Integer> myList = new Stack<>();
		
		myList.add(20);
		myList.add(30);
		myList.add(10);
		myList.add(20);
		myList.add(10);
		myList.add(10);
		myList.add(null);//NullPointerException
		myList.add(null);
		
		//Collections.sort(myList);
		System.out.println(myList);
		
		
	}

}
