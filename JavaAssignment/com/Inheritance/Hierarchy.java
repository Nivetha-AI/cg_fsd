package com.Inheritance;


class User{
	String name ;
	String email;
	int userId;
	public User(String name, String email, int userId) {
		super();
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	public void display() {
		System.out.println("Name : "+name );
		System.out.println("Email : "+email );
		System.out.println("User ID : "+userId );
	}
}
class Customer extends User{

	public Customer(String name, String email, int userId) {
		super(name, email, userId);// call to parent class
		// TODO Auto-generated constructor stub
	}
	public void purcaseproduct(String productName) {
System.out.println(name +" has purchased "+productName);
	}
}
class Seller extends User{

	public Seller(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}
	public void assProduct(String productName , double price) {
		System.out.println(name+" has listed a new product " +productName + " for $ "+ price);
	}
}
class Admin extends User{

	public Admin(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}
	public void validateproduct(String productName) {
		System.out.println(name+ " has approved the product "+productName);
	}
	
}
public class Hierarchy {
public static void main(String[] args) {
	Customer customer= new Customer("Alice","alice@mail.com",111);
	Seller sell= new Seller("jim","jm@gmail.com",112);
	Admin admin= new Admin("ram","rm@gmail.com",113);
	
	customer.display();
	customer.purcaseproduct("laptop");
	
	
	sell.display();
	sell.assProduct("smartwatch", 20000.0);
	
	admin.display();
	
	admin.validateproduct("smartwatch");
}
}
