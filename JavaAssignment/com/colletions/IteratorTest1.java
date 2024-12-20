package com.colletions;



import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args) {
        // Create an ArrayList and populate it with strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Salini");
        names.add("Ram");
        names.add("David");
        names.add("Priya");

        System.out.println("Original List: " + names);

       
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println("Current Name: " + name);

            if (name.startsWith("S") || name.startsWith("P")) {
                itr.remove();
            }
           
        }

        System.out.println("Modified List after Iterator: " + names);
    }
}
