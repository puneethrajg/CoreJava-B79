package com.java.lab.pocs;

import java.util.Scanner;

//	27-10-2026 ->
public class NaukriPOC {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******************************");
		System.out.println("HR CALL SIMULATOR POC");
		System.out.println("******************************");
		
		System.out.println("Please Enter your name to start the simulation : ");
		String name = sc.nextLine();
		System.out.println("Hello, Am I Speaking to Mr."+ name + " ?");
		
		System.out.println("Yes. This is "+ name + " Speaking");
		
		System.out.println("I am a HR calling from KFC Company. Is it a good time to talk?");
		
		boolean isGoodTime = sc.nextBoolean();
		
		if(isGoodTime) {
			
			System.out.println("Yes.. Please go ahead. what is it about?");
			System.out.println("I've looked into your profile, Do you know Java, SQL, Spring Boot?");
			boolean knowJava	= sc.nextBoolean();
			boolean knowSQL 	= sc.nextBoolean();
			boolean knowSB 	= sc.nextBoolean();
			if(knowJava && knowSQL && knowSB) {
				System.out.println("Okay.. Do you have any active backlogs?");
				boolean hasBacklogs = sc.nextBoolean();
				if(!hasBacklogs) {
					
					System.out.println("Okay.. Moving on to the next question..");
					System.out.println("Do you have any experience in his domain?");
					boolean haveExperience = sc.nextBoolean();
					if(haveExperience) {
						
						System.out.println("Okay.. We have scheduled an F2F Interview and mailed you regarding it.. Please check your inbox..");
						System.out.println("*************SIMULATION ENDED THANK YOU*************");
					}else {
						System.out.println("Sorry.. We are looking candidates with for 2+ YOE");
						System.out.println("*************SIMULATION ENDED THANK YOU*************");
					}
					
				}else {
					System.out.println("Sorry..you did not meet the backlog requirements ");
					System.out.println("**Hangsup the Call**");
					System.out.println("*************SIMULATION ENDED THANK YOU*************");
					
				}
				
			}else {
				System.out.println("Sorry.. you did not meet the techincal requirements..");
				System.out.println("**Hangsup the Call**");
				System.out.println("*************SIMULATION ENDED THANK YOU*************");
			}
		
			
		}else {
			
			System.out.println("No issues.. please let us know when you will be available..");
			System.out.println("*Reschedules the call*");
			System.out.println("*************SIMULATION ENDED THANK YOU*************");
		}
		
		sc.close();
		
		
	}
}
