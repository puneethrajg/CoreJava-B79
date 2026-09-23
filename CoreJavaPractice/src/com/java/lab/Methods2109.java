package com.java.lab;

public class Methods2109 {
	
	static Methods2109 m = new Methods2109();
	
	public static void staticMethodOne() {
		
		System.out.println("Static method - 01 called");
		staticMethodTwo();
	}
	
	public static void staticMethodTwo() {
		
		System.out.println("Static method - 02 called");
		m.instanceMethodOne();
	}
	
	public void instanceMethodOne() {
		
		System.out.println("Instance method - 01 called");
		instanceMethodTwo();
		
	}
	
	public void instanceMethodTwo() {
		
		System.out.println("Instance method - 02 called");
	}
	public static void main(String[] args) {
		
		staticMethodOne();
		
	}

}
