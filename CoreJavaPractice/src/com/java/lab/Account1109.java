package com.java.lab;

public class Account1109 {
	
	static int accountNoGenerator = 123;	
	int accNo;
	String accName;
	int salary;
	{	
		accountNoGenerator= accountNoGenerator + 1;
		accNo=accountNoGenerator;
		
		
	}
	public static void main(String[] args) {
		
		Account1109 a1 = new Account1109();
		
		
		
		System.out.println("Account No for A1 : "+a1.accNo);
		
		Account1109 a2 = new Account1109();
		System.out.println("Account No for A2 : "+a2.accNo);
		
		Account1109 a3 = new Account1109();
		System.out.println("Account No for A3 : "+a3.accNo);
	}

}
