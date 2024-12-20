package com.colletions;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> lh= new LinkedHashSet<String>();
	int size=lh.size();
	System.out.println("size "+size);
	lh.add("White");
	lh.add("Black");
	lh.add("Green");
	lh.add("Pink");
	
	int size1=lh.size();
	System.out.println("size "+size1);
	// add duplicate
	lh.add("White");
	
	LinkedHashSet<String> lhset2= new LinkedHashSet<String>();
	lhset2.add("Brown");
	lhset2.add(null);
	lh.addAll(lhset2);
	System.out.println(lh);
	
	
	int [] num= {5,3,4,23,45,5,89,67,47,56,90,56,89,32};
	ArrayList<Integer> ar=new ArrayList<Integer>();
	for(int i=0;i<num.length;i++) {
		ar.add(num[i]);
	}
	System.out.println("original list " +ar);
	LinkedHashSet<Integer> a= new LinkedHashSet<Integer>(ar);
	System.out.println(a);
	
	
}
}
