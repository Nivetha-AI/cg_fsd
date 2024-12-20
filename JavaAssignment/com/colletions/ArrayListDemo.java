package com.colletions;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList <String> a1= new ArrayList<String>();
	a1.add("mango");
	a1.add("Apple");
	a1.add("Banana");
	a1.add("pappaya");
	System.out.println(a1);
	
	System.out.println("Remove element "+a1.remove(2));
	System.out.println("After removing "+a1);
	
	System.out.println("Set new eleemnt : "+a1.set(2, null));
	System.out.println("After setting new eleemnt : "+a1);
	System.out.println("Get new eleemnt which is at index 3 : "+a1.get(2));
	
	System.out.println("size of te arraylist : "+a1.size());
	
	System.out.println("Appl is in my list or not ?"+a1.contains("Apple"));
	System.out.println("Increase arraylist capcity manually : ");
	a1.ensureCapacity(20);
	a1.trimToSize();

}
}
