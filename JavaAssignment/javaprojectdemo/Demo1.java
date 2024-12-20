package javaprojectdemo;

public class Demo1 {

	// local variable

	// non static variable -instance variable

	// static variable (class variable)-it will always declared a with static
	// keyword and shared by all the instance of the class
	// scope -> accessible by all methods , constructor , block , can be access
	// without object
	int instancevar = 10;// instance
	static int classvar = 30;// class

	void display() {
		int localvar = 200;// local
		System.out.println("instance variable = " + instancevar);
		System.out.println("Local variable = " + localvar);
		System.out.println("static variable = " + classvar);

	}

	public static void main(String[] args) {
		System.out.println("class variable or static variable = " + classvar);
		Demo1 d1 = new Demo1();
		System.out.println("instance variable = " + d1.instancevar);

		d1.display();

	}
}
