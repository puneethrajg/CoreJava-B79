package com.java.lab.langfundamentals;

public class DataTypesAutoBoxing0110 {
	
	String studentId;
	
	Double studentMarks;
	
	Boolean passStatus;
	
	public static void main(String[] args) {
		
		DataTypesAutoBoxing0110 stu1 = new DataTypesAutoBoxing0110();
		
		stu1.studentId = "JFS-B79-8303";
		stu1.studentMarks = 70.0;
		stu1.passStatus = true;
		
		String studentId = stu1.studentId;
		double studentMarks = stu1.studentMarks;
		boolean passStatus = stu1.passStatus;
		
		System.out.println("------------------Auto-Boxing------------------");
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Marks : "+studentMarks);
		System.out.println("Student Pass Status : "+passStatus);
		
		stu1.studentId = studentId;
		stu1.studentMarks = studentMarks;
		stu1.passStatus = passStatus;
		
		System.out.println("------------------Auto-UnBoxing------------------");
		System.out.println("Student ID : "+stu1.studentId);
		System.out.println("Student Marks : "+stu1.studentMarks);
		System.out.println("Student Pass Status : "+stu1.passStatus);
		
		
		
		
	}
	

}
