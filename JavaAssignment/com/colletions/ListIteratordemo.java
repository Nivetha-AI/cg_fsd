package com.colletions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator
 * 1.traverse in both direction
 * 2- modifying element wile iterating 
 * 3- adding new element during iteration
 * methods -
 * hasNext(), next(),remove(), previous(
, add(E,e), set(E,e)
 * 
 */
class Employee1 {
	private int id;
	private String name;

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}

}

public class ListIteratordemo {

	public static void printdata(List<Employee1> employees) {
		System.out.println("\n Current employee ");
		for (Employee1 e1 : employees) {
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee1> emp = new ArrayList<>();
		emp.add(new Employee1(101, "sam"));
		emp.add(new Employee1(102, "ram"));
		emp.add(new Employee1(103, "priya"));
		emp.add(new Employee1(104, "praveen"));
		emp.add(new Employee1(105, "Preeti"));
		// adding new employee
		System.out.println("adding new Employee");
		ListIterator<Employee1> ltr = emp.listIterator();
		ltr.add(new Employee1(106, "Rose"));
		ltr.add(new Employee1(107, "Harry"));

		// read forward
		System.out.println("\nIterating forward");
		ltr = emp.listIterator();
		while (ltr.hasNext()) {
			Employee1 e1 = ltr.next();
			System.out.println(e1);
		}
        // update

		System.out.println("\n Updating employee name 103");
		ltr = emp.listIterator();
		while (ltr.hasNext()) {
			Employee1 e2 = ltr.next();
			if (e2.getId() == 103) {
				ltr.set(new Employee1(103, "Thomas"));

			}
		}
		printdata(emp);

		// delete
		System.out.println("\n Delete employee name 106");
		ltr = emp.listIterator();
		while (ltr.hasNext()) {
			Employee1 e3 = ltr.next();
			if (e3.getId() == 106) {
				ltr.remove();

			}
		}
		printdata(emp);

		// read by backward direction
		System.out.println("\n Iterating backward");
		ltr = emp.listIterator(emp.size());
		while (ltr.hasPrevious()) {
			Employee1 e4 = ltr.previous();
			System.out.println(e4);
		}

	}
}
