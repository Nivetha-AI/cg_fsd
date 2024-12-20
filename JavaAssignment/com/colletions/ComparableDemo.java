package com.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 {
	private int rollno;
	private String name;
	private int age;
	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}
class Agecomparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
		  return 0;
		else if (o1.getAge()>o2.getAge()) {
			return 1;
		}
		else
		 return -1;
		
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
     ArrayList<Student1> ar= new ArrayList<Student1>();
     ar.add(new Student1(101,"Nivetha",29));
     ar.add(new Student1(102,"Varsha",25));
     ar.add(new Student1(103,"Priya",27));
     Collections.sort(ar,new Agecomparator());
     System.out.println("sorted student object ");
     Iterator<Student1> itr= ar.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	}

}
