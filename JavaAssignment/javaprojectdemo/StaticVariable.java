package javaprojectdemo;

public class StaticVariable {
// class variable or static variable
	static int count =0;
	void increment() {
		count++;
	}
	public static void main(String[] args) {
		StaticVariable s1=  new StaticVariable();
		StaticVariable s2=  new StaticVariable();
		
		s1.increment();
		s2.increment();
		
		System.out.println("Total count: "+StaticVariable.count);


	}

}
