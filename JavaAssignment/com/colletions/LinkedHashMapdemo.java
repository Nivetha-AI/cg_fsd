package com.colletions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max=5;
		Map<String, String> map = new LinkedHashMap<String, String>(){
		protected boolean removeEldestEntry(Map.Entry<String, String> e) {
			return size() > max;
		}
	};
	System.out.println(" initial Entries of linkedHashMap: "+map);
		map.put("Apple", "green");
		map.put("Banana", "Yellow");
		map.put("Cherry", "Red");
		map.put("Mango", "Yellow");
		map.put("Guava", "Green");
		System.out.println("Entries of linkedHashMap: "+map);
		map.put("strwaberry","red");
		System.out.println(" displaying map after adding more entry : "+map);
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		System.out.println("Iterarting entries of LinkedhashMap : ");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
	}

}
