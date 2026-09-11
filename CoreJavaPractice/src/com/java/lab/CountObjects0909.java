package com.java.lab;
///09-09-2026

///1.Write a Java program to create multiple objects of a class 
///count the total number of objects created. Display the object count after creating the objects.

public class CountObjects0909 {

	static int count = 0;

	{
		count = count + 1;
	}

	public static void main(String[] args) {

		CountObjects0909 ob1 = new CountObjects0909();
		CountObjects0909 ob2 = new CountObjects0909();
		CountObjects0909 ob3 = new CountObjects0909();

		System.out.println("Count : " + CountObjects0909.count);

	}

}
