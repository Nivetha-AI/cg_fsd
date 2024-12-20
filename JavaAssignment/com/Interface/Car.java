package com.Interface;

public class Car implements Vehicle {
	String color;
	String carColor(String color) {
		return color;
	}

	@Override
	public void start() {
		System.out.println("Starting engine");
	}

	@Override
	public void stop() {
		System.out.println("Stop engine");
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.stop();
		c.carColor("red");
		
		
	}
}
