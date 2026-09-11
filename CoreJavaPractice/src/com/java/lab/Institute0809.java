package com.java.lab;
//Task(08-09-2026): Create a Java class Institute with the following requirements:

//Declare a static variable TrainerName1.
//Declare a static variable TrainerName2.
//Declare an instance variable Employee Name, EmployeetId, EmployeeDesignation.
//Assign values to both variables.
//Create an  5 object of the Institute class.

public class Institute0809 {

	static String trainerName1 = "abc";
	static String trainerName2 = "pqr";

	int employeeId;
	String employeeName;
	String employeeDesignation;

	public static void main(String[] args) {

		Institute0809 emp1 = new Institute0809();
		emp1.employeeId = 101;
		emp1.employeeName = "Ruthvik";
		emp1.employeeDesignation = "IT";

		Institute0809 emp2 = new Institute0809();
		emp2.employeeId = 102;
		emp2.employeeName = "Vinod";
		emp2.employeeDesignation = "HR";

		Institute0809 emp3 = new Institute0809();
		emp3.employeeId = 103;
		emp3.employeeName = "Moulali";
		emp3.employeeDesignation = "SWE";

		Institute0809 emp4 = new Institute0809();
		emp4.employeeId = 104;
		emp4.employeeName = "Akhilesh";
		emp4.employeeDesignation = "ASE";

		Institute0809 emp5 = new Institute0809();
		emp5.employeeId = 105;
		emp5.employeeName = "Lohith";
		emp5.employeeDesignation = "IT";
		
		System.out.println("Trainer Name(1) : " +Institute0809.trainerName1);
		System.out.println("Trainer Name(2) : " +Institute0809.trainerName2);
		System.out.println("------------------------");
		System.out.println("Employee ID : " + emp1.employeeId);
		System.out.println("Employee Name : " + emp1.employeeName);
		System.out.println("Employee Designation : " + emp1.employeeDesignation);

		System.out.println("------------------------");
		System.out.println("Employee ID : " + emp2.employeeId);
		System.out.println("Employee Name : " + emp2.employeeName);
		System.out.println("Employee Designation : " + emp2.employeeDesignation);

		System.out.println("------------------------");
		System.out.println("Employee ID : " + emp3.employeeId);
		System.out.println("Employee Name : " + emp3.employeeName);
		System.out.println("Employee Designation : " + emp3.employeeDesignation);

		System.out.println("------------------------");
		System.out.println("Employee ID : " + emp4.employeeId);
		System.out.println("Employee Name : " + emp4.employeeName);
		System.out.println("Employee Designation : " + emp4.employeeDesignation);

		System.out.println("------------------------");
		System.out.println("Employee ID : " + emp5.employeeId);
		System.out.println("Employee Name : " + emp5.employeeName);
		System.out.println("Employee Designation : " + emp5.employeeDesignation);
	}

}
