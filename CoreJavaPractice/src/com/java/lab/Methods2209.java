package com.java.lab;

public class Methods2209 {
	
	static Methods2209 obj = new Methods2209();
	static {
		Methods2209.staticMethodOne();
	}
	public static void staticMethodOne() {
		System.out.println("Static Method One Called!");
		staticMethodTwo();
	}
	
	public static void staticMethodTwo() {
		
		System.out.println("Static Method Two called!");
		staticMethodThree();
	}
	public static void staticMethodThree() {
		
		System.out.println("Static Method Three called!");
		obj.instanceMethodOne();
	}
	
	public void instanceMethodOne() {
		System.out.println("Instance Method One called!");
		instanceMethodTwo();
	}
	public void instanceMethodTwo() {
		System.out.println("Instance Method Two called!");
	}
	
	public static void main(String[] args) {
		
		
	}

}
