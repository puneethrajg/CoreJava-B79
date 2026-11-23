package com.java.lab.pocs;

import java.util.Scanner;

//	Encapsulation Driver class
public class SecureBank_Encapsulation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        BankAccount_Encapsulation account = null;

        int choice;

        do {
            System.out.println("\n===== Welcome to SecureBank =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (account == null) {
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Account Number: ");
                        long accNo = sc.nextLong();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        account = new BankAccount_Encapsulation(
                            name, accNo, balance
                        );
                    } else {
                        System.out.println("Account already exists!");
                    }
                    break;

                case 2:
                    if (account != null) {
                        System.out.println("Account Holder: "
                            + account.getAccountHolderName());
                        System.out.println("Account Number: "
                            + account.getAccountNo());
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.println("Current Balance: "
                            + account.getBalance());
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 5:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for banking with SecureBank!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
		
	}


