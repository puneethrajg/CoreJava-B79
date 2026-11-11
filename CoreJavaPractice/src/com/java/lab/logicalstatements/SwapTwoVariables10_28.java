package com.java.lab.logicalstatements;

import java.util.Scanner;

//1) write a Java program to swap two numbers with using a third variable 

//2) Complete Proof Of Concept(POC)  on Nested if
public class SwapTwoVariables10_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Value :");
		int a = sc.nextInt();
		
		System.out.println("Enter b Value :");
		int b = sc.nextInt();
		

		System.out.println("Before swapping :");
		System.out.println(a + " " + b);
		
//		->	with using third variable
		
//		int temp = a; 	
//		a = b;			
//		b = temp;		
//
//		-> Without using Third variable!
		
//		a = a ^ b; OR a = a + b;
//		b = b ^ a; OR b = a - b;
//		a = a ^ b; OR a = a - b;
		
		
		System.out.println("After swapping :");
		System.out.println(a + " " + b);
		
	}

}
