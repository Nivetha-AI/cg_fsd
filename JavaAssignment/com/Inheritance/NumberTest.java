package com.Inheritance;

class Number{
	int x=20;
	void display() {
		System.out.println("x= "+x);
	}
}

class Number2 extends Number{
	int x=50;
	void display() {
		System.out.println("x= "+x);
	}
}
public class NumberTest {
public static void main(String[] args) {
	Number2 n1= new Number2();
	n1.display();
}
}

//comapny employee is generic class id name , slary , department ,manager ,

// managger addintion managing how manager can manage all the employees 
//