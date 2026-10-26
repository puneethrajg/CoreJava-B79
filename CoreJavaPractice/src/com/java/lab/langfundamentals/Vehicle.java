package com.java.lab.langfundamentals;
//
//	Date 26/10/2026
//	Create a Vehicle class with a field type and a one-argument constructor accepting type.
//	› Create a Car class that extends Vehicle,
/*//	brand and price, and a three-argument constructor accepting type, brand, and price.
> Create an ElectricCar class that extends Car, with a field batteryCapacity 
and a four-argument constructor accepting type, brand, price, and batteryCapacity.
>  In the ElectricCar class, create an object by passing all four values.
› The values should be passed from ElectricCar to Car, and from Car to Vehicle through constructor chaining.
› Create a display() method inside
ElectricCar and print type, brand, price, and batterycapacity.*/
public class Vehicle {
	
	String vehicleType;
	
	public Vehicle(String vehicleType) {
		
		this.vehicleType = vehicleType;
	}
	public static void main(String[] args) {
		
		ElectricCar ec1 = new ElectricCar("Petrol", "BMW", 7000000.00, 79.86);
		
		ElectricCar ec2 = new ElectricCar("EV", "Tesla", 9000000.00, 57.56);
		
		ec1.displayCar();
		
		ec2.displayCar();
	}
	
}

class Car extends Vehicle {
	
	String carBrand;
	double carPrice;
	
	public Car(String vehicleType, String carBrand, double carPrice) {
		super(vehicleType);
		this.carBrand = carBrand;
		this.carPrice = carPrice;
		
	}

		
}
class ElectricCar extends Car {
	
	double batteryCapacity;
	
	public ElectricCar(String vehicleType, String carBrand, double carPrice, double batteryCapacity) {
		
		super(vehicleType, carBrand, carPrice);
		this.batteryCapacity = batteryCapacity;
	}
	
	void displayCar() {
		
		
		System.out.println("Car Brand : "+carBrand);
		System.out.println("Car Price : "+carPrice);
		System.out.println("Type of Car : "+vehicleType);
		System.out.println("Battery Capacity : "+batteryCapacity);
		
		System.out.println("-------------------------------------------");
	}
	
}

