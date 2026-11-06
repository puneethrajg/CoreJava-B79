package com.java.lab.logicalstatements;

import java.util.Scanner;

public class GradeProgramElseIf10_27 {
	
	static int takeInput() {
		int studentMarks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks :");
		studentMarks = sc.nextInt();
		return studentMarks;
	}

	static void calculateGrade(int studentMarks) {
		
		if(studentMarks > 100 || studentMarks < 0) {
			System.out.println("Invalid Marks! Please correct once again!");
		}
		else if (studentMarks >= 60 && studentMarks <= 69) {
			
			System.out.println("Grade D");
		}
		else if (studentMarks >= 70 && studentMarks <= 79) {
			
			System.out.println("Grade C");
		}
		else if (studentMarks >= 80 && studentMarks <= 89) {
			
			System.out.println("Grade B");
		}
		else if (studentMarks >= 90 && studentMarks <= 100) {
			
			System.out.println("Grade A");
		}else {
			
			System.out.println("Failed!");
		}
		
		
	}
	public static void main(String[] args) {
		int studentMarks = GradeProgramElseIf10_27.takeInput();
		calculateGrade(studentMarks);
	}
}
