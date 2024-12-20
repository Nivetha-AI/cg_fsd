package com.Inheritance;

class Vehicle{
	private String brand;
    private int wheels;
    private String date;
	public Vehicle(String brand, int wheels, String date) {
		super();
		this.brand = brand;
		this.wheels = wheels;
		this.date = date;
	}
    
    public void drive() {
    	System.out.println("brand: "+ brand +" wheels: "+wheels+" date: "+date);
    }
    
}
class Bike  extends Vehicle{
	private String fueltype;

	public Bike(String brand, int wheels, String date, String fueltype) {
		super(brand, wheels, date);
		this.fueltype = fueltype;
	}

    @Override
    public void drive() {
        super.drive();
        System.out.println("Fuel Type: " + fueltype);
    }
}
class ElectricBike extends Bike{
	private int batteryCapacity;

	public ElectricBike(String brand, int wheels, String date, String fueltype, int batteryCapacity) {
		super(brand, wheels, date, fueltype);
		this.batteryCapacity = batteryCapacity;
	}
	
	
}
class Car extends Vehicle{
	private String fueltype;

	public Car(String brand, int wheels, String date, String fueltype) {
		super(brand, wheels, date);
		this.fueltype = fueltype;
	}
	 @Override
	    public void drive() {
	        super.drive();
	        System.out.println("Fuel Type: " + fueltype);
	    }
}



class ElectricCar extends Car{
	private int batteryCapacity;

	public ElectricCar(String brand, int wheels, String date, String fueltype, int batteryCapacity) {
		super(brand, wheels, date, fueltype);
		this.batteryCapacity = batteryCapacity;
	}
	 @Override
	    public void drive() {
	        super.drive();
	        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	    }
	
}
public class MultilevelInheritance {
public static void main(String[] args) {
	ElectricCar electricCar = new ElectricCar("Tesla", 4,"03-09-03" ,"Electric", 100);
    System.out.println("\nElectric Car Details:");
    electricCar.drive();
}
}
