package com.Inheritance;

class A {

	public void m1() {
		System.out.println("m1 of a");
	}
}

class B extends A {
	public void m2() {
		System.out.println("m2 of class B");
	}
}

public class demo {
	public static void main(String[] args) {
		B b1 = new B();
		A a = b1;

		a.m1();

	}
}
