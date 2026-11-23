package com.java.lab.pocs;

//Abstraction POC
public abstract class NotificationService {
	
	String recipient;
	
	String message;
	
	public NotificationService(String recipient, String message) {
		
		this.recipient = recipient;
		this.message = message;
	}
	
	abstract void sendNotification(); 

}
