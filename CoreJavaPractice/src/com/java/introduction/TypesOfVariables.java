package com.java.introduction;

public class TypesOfVariables {
	
	static String k = "Puneeth";
	static int a;
	
	String l;
	int m;
	public static void main(String[] args) {
		
		TypesOfVariables t1 = new TypesOfVariables();
		t1.l = "Raj";
		t1.m = 8303;
		
		a = 3314;
		
		System.out.println("Static Variable k : "+ k);
		System.out.println("Static Variable a : "+ a);
		System.out.println("---------------------------------------------");
		System.out.println("Instance Variable l : "+ t1.l);
		System.out.println("Instance Variable m : "+ t1.m);
		
		
	}

}
