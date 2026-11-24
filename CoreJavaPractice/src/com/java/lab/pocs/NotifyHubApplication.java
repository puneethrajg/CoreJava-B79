package com.java.lab.pocs;

import java.util.Scanner;

// Abstraction Driver Class
public class NotifyHubApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String wanttoContinue;
		int choice;
		do {
			NotificationService notification = null;
			System.out.println("========NotifyHub=========");
			System.out.println("1. Email Notification");
			System.out.println("2. SMS Notification");
			System.out.println("3. WhatsApp Notification");
			System.out.println("4. Exit");
			
			System.out.print("Welcome! Please enter your choice :");
			choice = sc.nextInt();
			sc.nextLine();
			
			
			
			switch(choice) {
			
				
			case 1:
				System.out.println("Enter Recipient Name :");
				String recipient = sc.nextLine();
				System.out.println("Enter the message :");
				String message = sc.nextLine();
				notification = new EmailNotification(recipient, message);
				break;
			case 2:
				System.out.println("Enter Recipient Name :");
				String recipient2 = sc.nextLine();
				System.out.println("Enter the message :");
				String message2 = sc.nextLine();
				notification = new SMSNotification(recipient2, message2);
				break;
			case 3:
				System.out.println("Enter Recipient Name :");
				String recipient3 = sc.nextLine();
				System.out.println("Enter the message :");
				String message3 = sc.nextLine();
				notification = new WhatsAppNotification(recipient3, message3);
				break;
			case 4:
				System.out.println("Thank you!");
				break;
			default :
				System.out.println("Invalid Choice");
			}
			
			if(notification != null) {
				notification.sendNotification();
			}
			System.out.println("Do you want to contiue?");
			wanttoContinue = sc.next();
			
		}while(wanttoContinue.equalsIgnoreCase("Y"));
	}
}
