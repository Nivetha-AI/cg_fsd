package com.Inheritance;
class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
}
class Rectangle extends Shape{
	double length , width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*length*width;
	}
	
}
public class AbstractClassExample {
public static void main(String[] args) {
	Shape c=new Circle(5);
	System.out.println("Area of circle= "+c.area());
	System.out.println("Perimeter of circle = "+c.perimeter());
	
	
	
	Shape r=new Rectangle(5,7);
	System.out.println("Area of Rectangle= "+r.area());
	System.out.println("Perimeter of Rectangle = "+r.perimeter());
	
	
	
	
}
}
