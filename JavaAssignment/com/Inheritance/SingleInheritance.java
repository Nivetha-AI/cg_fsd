package com.Inheritance;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.setName(name);
		this.salary = salary;
		this.department = department;
	}

	public void work() {
		System.out.println(getName() + " is working as an employee");
	}

	public void getSalary() {
		System.out.println(getName() + " Is getting " + salary + " normal employee");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}

class Manager extends Employee {

	private String managingDep;

	public Manager(int id, String name, double salary, String department, String managingDep) {
		super(id, name, salary, department);
		this.managingDep = managingDep;
	}

	public void manageEmployee() {
		System.out.println("Manager " + super.getName() + " is managing department " + managingDep );

	}
	@Override
    public String toString() {
        return super.toString() + ", Managing Department: " + managingDep;
    }

	

}

public class SingleInheritance {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Nivetha", 30000, "iT");
		System.out.println("Employee Details: " + e);
		e.work();
		e.getSalary();
		System.out.println("***********");
		System.out.println("                         ");
		Manager m = new Manager(201, "Ram", 80000, "Admin", "IT");
		System.out.println("Manager Details: " + m);
		m.manageEmployee();
	}
}
