package com.java.lab.pocs;

public class WhatsAppNotification extends NotificationService{

	public WhatsAppNotification(String recipient, String message) {
		super(recipient, message);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendNotification() {
		
		System.out.println("Sending an WhatsApp Message to : "+recipient);
		
		
	}

}
