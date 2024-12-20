package com.colletions;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//1-Enumeration--can create an object of enumeration by calling element() of vector class.Enumeration e=v.elements()

// it has 2 methods
//public boolean hasNextElement()
// public object nextElement()
public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Vector v = new Vector();
   Enumeration e=v.elements();
   Iterator itr= v.iterator();// itr is the inner class present inside te vector which implements the iterator interface
   ListIterator ltr=v.listIterator();
   
	System.out.println(e.getClass().getName());
	System.out.println(itr.getClass().getName());
	System.out.println(ltr.getClass().getName());
	}
/*
 * limitation
 * 1.this is not universal cursor , concept is applicable only oon leagacy class
 * 2.it move forward direction
 * 3.java is not recommended this for new project
 * 4.you have only read operation,
 */
}
