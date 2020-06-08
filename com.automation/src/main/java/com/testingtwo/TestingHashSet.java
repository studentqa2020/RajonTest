package com.testingtwo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestingHashSet {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(2);
		mySet.add(2);
		mySet.add(4);
		mySet.add(5);
		mySet.add(null);
		
		System.out.println(mySet);
		
		
Set<Integer> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add(2);
		myLinkedSet.add(2);
		myLinkedSet.add(1);
		myLinkedSet.add(4);
		myLinkedSet.add(3);
		myLinkedSet.add(null);
		myLinkedSet.add(null);
		
		
		System.out.println(myLinkedSet);
		
		Set<Integer> myTreeSet = new TreeSet<>();
		
		myTreeSet.add(2);
		myTreeSet.add(2);
		myTreeSet.add(1);
		myTreeSet.add(4);
		myTreeSet.add(3);
		//myTreeSet.add(null); // no null --- NullpointerEx
		//myTreeSet.add(null);
		
		
		System.out.println(myTreeSet);
		
	}
}
