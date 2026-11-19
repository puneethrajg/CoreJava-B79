package com.java.oops.inheritance;

public class Car extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Car has been started.");
	}
	
	@Override
	void stop() {
		System.out.println("Car has been stopped.");
	}
	
	void sunRoof() {
		
	}
 }
