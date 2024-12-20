package com.Inheritance;
// Types of relationsip among classes

// Dependence(USe-a) 

class Product {
	String productname;
	double price;

	public Product(String productname, double price) {
		super();
		this.productname = productname;
		this.price = price;
	}

	public void displayprod() {
		System.out.println("product name :" + productname);
		System.out.println("price :" + price);

	}
}

class Customer1 {
	String name;
	int customerId;

	public Customer1(String name, int customerId) {
		super();
		this.name = name;
		this.customerId = customerId;
	}

	// Method where customer "Uses -A " product ( dependent)
	public void purchaseProd(Product pro) {
		System.out.println(name + "Is purchasing the following product :");
		pro.displayprod();
		System.out.println(name + "Has successfully purchased ");

	}
}

public class Uses_A_dependency {
	public static void main(String[] args) {
		// instance of product
        Product laptop = new Product("Laptop",90000.0);
        Product phone= new Product("SmartPhone", 40000.0);
        
        // create instance of customer
        Customer1 cus = new Customer1("Dona",1);
        
        cus.purchaseProd(phone);
        cus.purchaseProd(laptop);
        
        
	}
}
