package com.java.lab.langfundamentals;

public class DataTypesWrapperClasses3009 {


	Integer studentId;
	String studentName;
	Integer studentAge;
	Double studentMarks;
	Character studentGrade;
	Boolean isPassed;
	
	public static void main(String[] args) {
		

		DataTypesWrapperClasses3009 dt = new DataTypesWrapperClasses3009();
				
//		If we declare the local variables, then we must Initialize it to use it.
//		After declaring the Instance variables, we get the "Null" values
		System.out.println("----------------Before Initializing the variables-----------------");
		System.out.println("Student ID :" +dt.studentId);
		System.out.println("Student Name :" +dt.studentName);
		System.out.println("Student Age :" +dt.studentAge);
		System.out.println("Student Marks :" +dt.studentMarks);
		System.out.println("Student Grade :" +dt.studentGrade);
		System.out.println("Is Student Passed? :" +dt.isPassed);
		
		dt.studentId = 101;
		dt.studentName = "Puneeth";
		dt.studentAge = 22;
		dt.studentGrade = 65;
		dt.isPassed = true;
		System.out.println("----------------After Initializing the variables-----------------");
		
		System.out.println("Student ID :" +dt.studentId);
		System.out.println("Student Name :" +dt.studentName);
		System.out.println("Student Age :" +dt.studentAge);
		System.out.println("Student Marks :" +dt.studentMarks);
		System.out.println("Student Grade :" +dt.studentGrade);
		System.out.println("Is Student Passed? :" +dt.isPassed);
		
		
		
	}

}
