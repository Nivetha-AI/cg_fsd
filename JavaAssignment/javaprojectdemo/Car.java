package javaprojectdemo;

public class Car {
	double price = 1000000.0;
	String color = "Blue";
	String type = "Aadi";

	void carfunc() {
		System.out.println("Car type: " + type + "\n" + "Color: " + color + "\n" + "Price: " + price);
	}

	public static void main(String[] args) {

		Car ci = new Car();
		ci.carfunc();
	}
}
