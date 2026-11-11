package com.java.lab.langfundamentals;

public class VoidMethods0210 {

	String studentName;
	int studentNumber;
	String studentCourse;

	void displayStudentDetails() {

		System.out.println("Student Name : " + studentName);
		System.out.println("Student Number : " + studentNumber);
		System.out.println("Student Course : " + studentCourse);

	}

	double calculateTotal(double maths, double physics, double chemistry) {

		double total = maths + physics + chemistry;

		System.out.println("Total : " + total);
		return total;
	}

	double calculateAverage(double total) {

		double avg = total / 3;

		System.out.println("Average : " + avg);
		return avg;
	}

	public static void main(String[] args) {

		VoidMethods0210 stu1 = new VoidMethods0210();

		stu1.studentNumber = 3314;
		stu1.studentName = "Puneeth";
		stu1.studentCourse = "JFS";

		stu1.displayStudentDetails();

		double total = stu1.calculateTotal(40, 54.5, 60.7);

		stu1.calculateAverage(total);
	}

}
