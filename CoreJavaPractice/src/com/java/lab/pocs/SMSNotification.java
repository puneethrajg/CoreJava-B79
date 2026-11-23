package com.java.lab.pocs;

public class SMSNotification extends NotificationService{

	public SMSNotification(String recipient, String message) {
		super(recipient, message);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendNotification() {
		
		System.out.println("Sending an SMS to : "+recipient);

		
	}

}
