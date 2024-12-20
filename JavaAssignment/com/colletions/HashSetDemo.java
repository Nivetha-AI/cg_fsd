package com.colletions;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("first");
	a1.add("Third");
	a1.add("eight");
	System.out.println("Arraylist Elements : "+a1);
	HashSet<String> set = new HashSet<String>();
	set.add("first");
	set.add("second");
	set.add("Third");
	set.add("fourth");
	set.add("five");
	set.add("first");
	set.add("five");
	System.out.println("hashset Elements : "+set);
	System.out.println("After adding Duplicate :");
	System.out.println(set);
	System.out.println(" add some null ");
	set.add(null);
	set.add(null);

	System.out.println("after adding null ");
	System.out.println(set);
	System.out.println("lets add a1 into hashset ");
	set.addAll(a1);

	System.out.println("unorderded ashset elements without duplicates ");

	System.out.println(set);
	if(set.contains("five")) {
		System.out.println("available");
	}
	else {
		System.out.println(" not available");

	}
	System.out.println("Lets remove arraylist from hashset :");
	set.removeAll(a1);
	System.out.println("After removing arraylist from hashset :"+set);
	System.out.println("lets clear the hashset: ");
	set.clear();
	System.out.println(set);

	
}
}
