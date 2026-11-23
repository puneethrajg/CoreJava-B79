package com.java.lab.pocs;

public class BankAccount_Encapsulation {

	private String accountHolderName;

	private long accountNo;

	private double balance;
	

	public BankAccount_Encapsulation(String accountHolderName, long accountNo, double balance) {
		
		this.accountHolderName = accountHolderName;
		if(accountNo <=0) {
			System.out.println("Account number Invalid! Please enter correct account number.");
		}else {
			this.accountNo = accountNo;
		}
		if(balance < 0) {
			System.out.println("Account balance cannot be negative");
		}else {
			this.balance = balance;
			System.out.println("Account created successfully!");
		}
		
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		if (accountHolderName.isBlank()) {
			System.out.println("Account Holder Name shouldn't be empty!");
		} else {
			this.accountHolderName = accountHolderName;
		}

	}

	public long getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
		if(amount <= 0) {
			 System.out.println("Amount must be greater than 0!");
		}else {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount <= 0 || amount > balance) {
			System.out.println("Please enter valid amount!");
		}else {
			
			balance = balance - amount;
			System.out.println("Amount has been withdrawn successfully! Your current Balance is :"+balance);
		}
		
	}
}
