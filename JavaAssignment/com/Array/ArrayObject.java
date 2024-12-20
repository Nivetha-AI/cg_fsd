package com.Array;

import java.util.Arrays;
import java.util.Comparator;

class Employee{
	private int employeeId;
	private String name;
	private double salary;
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.setSalary(salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + getSalary() + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class ArrayObject {
public static void main(String[] args) {
	Employee[] e1= { new Employee(101,"nivetha ",50000),
			new Employee(102,"Preetha ",30000),
			new Employee(103,"rama ",80000)
			};
	Employee[] e2= { new Employee(101,"nivetha ",50000),
			new Employee(102,"Preetha ",30000),
			new Employee(103,"rama ",80000)
			};
	
	// array.equals
	System.out.println("Arrays equals : "+Arrays.equals(e1, e2));
	// array.copyof
	Employee[] employeesClone = Arrays.copyOf(e1, e1.length);
    System.out.println("Employees Clone: " + Arrays.toString(employeesClone));

    System.out.println("              ");
    e1[0].setSalary(55000);
    System.out.println("Employees original: " + Arrays.toString(e1));
    
    
    double increment = 0.10;
    for (Employee employee : e2) {
        employee.setSalary(employee.getSalary() + (employee.getSalary() * increment));
    }

    System.out.println("Updated Employees: " + Arrays.toString(e2));
    
    
    // array.sort
    Arrays.sort(e1, Comparator.comparingDouble(emp -> emp.getSalary()));
    System.out.println("Employees sorted by salary: " + Arrays.toString(e1));

    
    
    
}
}
