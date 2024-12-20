package com.colletions;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void display(SortedSet<Student> students) {
    	for(Student s:students) {
    		System.out.println(s);
    	}
    }
	public static void main(String[] args) {
		SortedSet<Student> students= new TreeSet<Student>();
		students.add(new Student (101,"Alice","Maths"));
		students.add(new Student (102,"Charlie","Physics"));
		students.add(new Student (109,"David","Chemistry"));
		students.add(new Student (107,"Arri","Social"));
		students.add(new Student (104,"Evan","Biology"));
		students.add(new Student (103,"Romie","Botany"));
		// display
		System.out.println("Registed student ");
		display(students);
		NavigableSet<Student> stu=new TreeSet<Student>();
		stu.add(new Student (101,"Alice","Maths"));
		stu.add(new Student (102,"Charlie","Physics"));
		stu.add(new Student (109,"David","Chemistry"));
		stu.add(new Student (107,"Arri","Social"));
		stu.add(new Student (104,"Evan","Biology"));
		stu.add(new Student (103,"Romie","Botany"));
		// remove 
		System.out.println("Remove student by id ");
		students.remove(new Student(102,"Charlie","Physics"));
		display(students);
		
		
		//get first entry and last entry details
		
		System.out.println(" \n First Student registered: "+students.first());
		System.out.println(" \n last Student registered: "+students.last());
		
		// subset
		System.out.println("\n Student with ID's between 101 & 104");
		SortedSet<Student> subset= students.subSet(new Student(101,"",""), new Student(104,"",""));
		display(subset);
		
		
		System.out.println("\n Students with ID's greater than 103 ");
        SortedSet<Student> highstu=students.tailSet(new Student(103,"",""));
        display(highstu);
        
        System.out.println("Navigate methods");
        System.out.println("\n student in this list is greater than equal to 102 "+ stu.higher(new Student(102,"","")));
        System.out.println("\n student in this list is lower than id 105 "+ stu.lower(new Student(105,"","")));
        display(stu);
        
        System.out.println("\n reverse order of student ");
        NavigableSet<Student> rev=stu.descendingSet();
        display(rev);
        
        
        System.out.println("Tailset of Navigableset ");
        NavigableSet<Student> set=stu.tailSet(new Student (102,"",""), true);// inclusive of 102
        
        display(set);
        
	}

}
