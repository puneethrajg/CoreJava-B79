package com.java.oops.inheritance;

//	Parent Class
class Vehicle11_19 {
	
	int vehicleSpeed = 50;
	
	void displaySpeed(){
		System.out.println("Vehicle Speed :"+vehicleSpeed);
		
	}
 }

//	Child Class 
class Car11_19 extends Vehicle11_19{
	
	int carSpeed = 100;
	void displaySpeed(){
		
		System.out.println("Car Speed :"+carSpeed);
	}
 }

//	Main Class
public class Vehicle_11_19_Main {

	public static void main(String[] args) {
		
		Vehicle11_19 veh = new Car11_19(); // Child Object with Parent Reference --> Can call Parent Class but 
//		since we overridden method in child class it executes Child class method called Up-Casting
		
		veh.displaySpeed();
	}
}
