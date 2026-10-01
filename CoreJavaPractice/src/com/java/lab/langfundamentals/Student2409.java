package com.java.lab.langfundamentals;

public class Student2409 {

	int studentRollNo;

	String studentName;

	double studentMarks;

	static String collegeName = "ALTS";

	static {
		System.out.println("ALTS");
	}

	{
		System.out.println("Student Object Created!");
	}

	public void displayStudentDetails() {

		System.out.println("Student Roll No : " + studentRollNo);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Marks : " + studentMarks);
		System.out.println("---------------------------------------------");

	}

	public static void displayCollege() {

		System.out.println("College Name : " + collegeName);
	}

	public static void main(String[] args) {

		Student2409 s1 = new Student2409();
		s1.studentRollNo = 8303;
		s1.studentName = "Puneeth Raj";
		s1.studentMarks = 70;

		s1.displayStudentDetails();

		Student2409 s2 = new Student2409();
		s2.studentRollNo = 8301;
		s2.studentName = "Lohith";
		s2.studentMarks = 90;

		s2.displayStudentDetails();

		Student2409.displayCollege();
	}

}
