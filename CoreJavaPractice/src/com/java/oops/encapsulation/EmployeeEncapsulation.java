package com.java.oops.encapsulation;

public class EmployeeEncapsulation {

	private int id;
	private String name;
	private double salary;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary > 0.0) {
			this.salary = salary;
		}
		
	}
	public String getPassword() {
		
		return password;
	}
	public void setPassword(String password) {
		
		if(password != null && password.length() >= 8) {
			System.out.println("Please must contain at least 8 characters");
		}else {
			this.password = password;
		}
		
	}
	
}
