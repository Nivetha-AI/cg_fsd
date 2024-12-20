package javaprojectdemo;

public class LocalVariabledemo {
	// we cannot use here it will error System.out.println("Localvariable
	// ="+localvar);
// local variable declared insside main not outside

	String model;
	int year;

	void displayInfo() {
		System.out.println(" Model" + model);
		System.out.println(" Year" + year);

	}

	public static void main(String[] args) {

		int localvar = 500;
		System.out.println("Localvariable =" + localvar);
		LocalVariabledemo l1 = new LocalVariabledemo();// instance variable
		l1.displayInfo();
	}

}
