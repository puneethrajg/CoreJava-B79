package com.java.lab;

///Task : 08-09-2026
//Create an Employee class with:
//Instance variables: empId, empName, salary
//Static variable: companyName
//Static block to initialize companyName
//Instance block to print a message
//Create 3 objects and observe the execution order of static block, instance block.
public class Employee0809 {
	static String companyName;

	int empId;
	String empName;
	int salary;

	static {
		companyName = "ABC";

	}
	
	{
		System.out.println("Company Name : "+Employee0809.companyName);
		System.out.println("-------------------------------------------");
//		Employee0809 e = new Employee0809(); -> StackOverFlowError
		
	}

	public static void main(String[] args) {

		Employee0809 emp1 = new Employee0809();
		emp1.empId = 101;
		emp1.empName = "Ruthvik";
		emp1.salary = 40000;

		Employee0809 emp2 = new Employee0809();
		emp2.empId = 102;
		emp2.empName = "Moulali";
		emp2.salary = 30000;

		Employee0809 emp3 = new Employee0809();
		emp3.empId = 103;
		emp3.empName = "Puneeth";
		emp3.salary = 50000;

		
		
			System.out.println("Employee ID : " + emp1.empId);
			System.out.println("Employee Name : " + emp1.empName);
			System.out.println("Employee Salary : " + emp1.salary);
			System.out.println("-------------------------------------------");

			
			System.out.println("Employee ID : " + emp2.empId);
			System.out.println("Employee Name : " + emp2.empName);
			System.out.println("Employee Salary : " + emp2.salary);
			System.out.println("-------------------------------------------");

			
			System.out.println("Employee ID : " + emp3.empId);
			System.out.println("Employee Name : " + emp3.empName);
			System.out.println("Employee Salary : " + emp3.salary);
			System.out.println("-------------------------------------------");

		

	}

}
