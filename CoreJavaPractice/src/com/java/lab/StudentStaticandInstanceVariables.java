package com.java.lab;

///07-09-2026 Task
///Task: Create a Java class Student with the following requirements:
///Declare a static variable collegeName.
///Declare an instance variable studentName, studentId, studentMarks.
///Assign values to both variables.
///Create an object of the Student class.
class Student {
	static String collegeName = "ALTS";
	String studentName; 
	int studentId; 
	double studentMarks;
	
	
	
}
public class StudentStaticandInstanceVariables {
	
	
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName = "Puneeth Raj";
		s.studentId = 101;
		s.studentMarks = 70.0;
		
		System.out.println("Student ID : "+s.studentId);
		System.out.println("Student Name : "+s.studentName);
		System.out.println("Student Marks : "+s.studentMarks);
		System.out.println("College Name : "+ Student.collegeName);
	}

}
