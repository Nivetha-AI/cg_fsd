package com.colletions;

import java.util.ArrayList;
import java.util.Iterator;
//types of iterator
// 1-Enumeration--can create an object of enumeration by calling element() of vector class.Enumeration e=v.elements()
//2.Iterator
//3.ListIterator
//4.SplitIterator(1.8)

public class IteratorTest {
public static void main(String[] args) {
	ArrayList<Integer> a1= new ArrayList<Integer>();
	for(int i=0;i<=8;i++) {
		a1.add(i);
	}
	System.out.println(a1);
	
	Iterator<Integer> itr=a1.iterator();
	//cecking the next element using reference variable itr 
	while(itr.hasNext()) {
		// moving cursor to next eleement using ref variable itr
		Integer i =itr.next();
		System.out.println(i);
		//remove
		
		if(i%2!=0)
			itr.remove();
		
	}
	System.out.println(a1);
}
}
