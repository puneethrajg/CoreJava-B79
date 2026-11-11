package com.java.lab.langfundamentals;

import java.util.Scanner;

public class ArithmeticOperationsMethods0510 {
	
	static Boolean a;
	
	static int additionOftwoNumbers(int a, int b) {

		int add = a + b;
		return add;
	}

	static int substractionOftwoNumbers(int a, int b) {

		int sub = a - b;

		return sub;
	}

	static int multiplicationOftwoNumbers(int a, int b) {

		int mul = a * b;

		return mul;
	}

	static int divisionOftwoNumbers(int a, int b) {

		int div = a / b;

		return div;
	}

	public static void main(String[] args) {

		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter second Number :");
		int b = sc.nextInt();
		
		System.out.println("Addition : " + additionOftwoNumbers(a, b));

		System.out.println("Substraction : " + substractionOftwoNumbers(a, b));

		System.out.println("Multiplication : " + multiplicationOftwoNumbers(a, b));

		System.out.println("Division : " + divisionOftwoNumbers(a, b));

	}

}
