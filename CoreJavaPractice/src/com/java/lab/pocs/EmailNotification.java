package com.java.lab.pocs;

public class EmailNotification extends NotificationService{

	public EmailNotification(String recipient, String message) {
		super(recipient, message);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendNotification() {
		
		System.out.println("Sending an Email to: "+recipient);
		
	}

}
