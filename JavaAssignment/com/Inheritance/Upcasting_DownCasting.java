package com.Inheritance;

// superclass nref subclass
// superclass sc = new subclass();

// subclass ref -----> superclass obj
// subclass obj = new superclass


class Animal{
	public void makesound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	public void makesound() {
		System.out.println("Dog Barks");
	}
	
	public void fetch() {
		System.out.println("Dog is fetching the ball");
	}
}
public class Upcasting_DownCasting {
public static void main(String[] args) {
	Dog dog = new Dog();// dog object
	Animal ani = dog;//implicit up casting
     ani.makesound();// calls because of dynamic method dispatch
    // ani.fetch();// compile time error :fetch is not a mthod of animal class
     
   // --------------------------------Downcasting
     
    Animal animal = new Dog();
    Dog dog1=(Dog) animal;// explicit downcasting
    
    dog1.makesound();
    dog1.fetch();
    
    
     
	
}
}
