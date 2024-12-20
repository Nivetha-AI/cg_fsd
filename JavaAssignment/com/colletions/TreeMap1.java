package com.colletions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	HashMap<Character, String> hmap = new HashMap<>();
	hmap.put('v', "violet");
	hmap.put('I', "Indigo");
	hmap.put('B', "Blue");
	hmap.put('G', "Green");
	hmap.put('R', "Red");
	
	TreeMap<Character, String> tmap=new TreeMap<>(hmap);
	System.out.println("Entries in ascending order of keys:"+ tmap);
	
	Object entryset=tmap.entrySet();
	System.out.println("Entry set :"+ entryset);
	System.out.println("Keyy set :"+ tmap.keySet());
	System.out.println("value set :"+ tmap.values());
	
	
	Object vGet=tmap.get('R');
	System.out.println("R: "+vGet);
	
	boolean containsKey=tmap.containsKey('B');
	System.out.println("Is key B present in map:" +containsKey);
	
	
	boolean containsValue=tmap.containsValue("Red");
	System.out.println("Is apple present in map : "+containsValue);
	
	// tmap.replace
	
	tmap.replace('G', "Grey");
	System.out.println(" update "+tmap);
	
}
}
