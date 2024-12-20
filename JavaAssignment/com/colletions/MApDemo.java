package com.colletions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class MApDemo {
	public static void main(String[] args) {
		HashMap<Character, String> hmap = new HashMap<>();
		hmap.put('v', "violet");
		hmap.put('I', "Indigo");
		hmap.put('B', "Blue");
		hmap.put('G', "Green");
		hmap.put('R', "Red");

		Iterator<Entry<Character, String>> itr = hmap.entrySet().iterator();

		System.out.println("Iterartor entries of hashmap");
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key);
		}

		Iterator<Character> itr2 = hmap.keySet().iterator();
		System.out.println("Iterating over key");
		while (itr2.hasNext()) {
			Object keyview = itr2.next();
			System.out.println(keyview);
		}
		Iterator<String> itr3 = hmap.values().iterator();
		System.out.println("Iterating over view");
		while (itr3.hasNext()) {
			Object vauleview = itr3.next();
			System.out.println(vauleview);
		}
	}
}
