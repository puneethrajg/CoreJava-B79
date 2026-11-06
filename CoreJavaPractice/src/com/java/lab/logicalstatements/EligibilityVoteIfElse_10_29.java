package com.java.lab.logicalstatements;

import java.util.Scanner;

// 29-10-26
//Write a Java program to check voting eligibility based on age, citizenship, and voter ID. 
//Use an int variable for age and boolean variables indianCitizen and hasVoterId. 
//If age is below 0, print "Invalid age"; if below 18, print "Not eligible to vote"; 
//if not an Indian citizen, print "Not eligible to vote"; 
//if there is no voter ID, print "Voter ID required"; otherwise, print "Eligible to vote"
public class EligibilityVoteIfElse_10_29 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();
		
		if(age < 0 || age < 18) {
			
			System.out.println("Invalid Age");
		}
		if(age >= 18) {
			
			System.out.println("Alright....Do you have Indian Citizenship?");
			boolean isIndian = sc.nextBoolean();
			
			if(isIndian) {
				
				System.out.println("Okay...Last question, Do you have Voter ID?");
				boolean hasVoterId = sc.nextBoolean();
				
				
				if(hasVoterId) {
					System.out.println("You are Eligible for vote");
				}else {
					System.out.println("You are Not eligible to vote.. Get LOSTTT");
					
				}
				
				
			}
		}
		
		
	}
}
