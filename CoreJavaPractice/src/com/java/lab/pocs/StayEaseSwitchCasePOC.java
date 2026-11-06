package com.java.lab.pocs;

import java.util.Scanner;

public class StayEaseSwitchCasePOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("WELCOME TO STAYEASE");
		System.out.println("--------------------------------");

		System.out.println("Welcome to StayEase sir. May I know your name please?");
		String custName = sc.nextLine();

		System.out.println("Please select your Room type ");
		System.out.println("1. Standard - Rs. 2,000/night");
		System.out.println("2. Deluxe Room - Rs. 3,500/night");
		System.out.println("3. Suite - Rs. 6,000/night");

		System.out.println("Enter your room choice");
		String roomType = sc.nextLine();

		double roomPrice = 0;

		switch (roomType) {

		case "std" -> {
			System.out.println("Thank you " + custName + "You have selected Standard Room!");
			System.out.println("You will be charging Rs. 2,000 per night");
			roomPrice = 2000.00;
		}
		case "del" -> {
			System.out.println("Thank you " + custName + " You have selected Deluxe Room!");
			System.out.println("You will be charging Rs. 3,500 per night");
			roomPrice = 3500.00;
			
		}
		case "sui" -> {
			System.out.println("Thank you " + custName + " You have selected Suite!");
			System.out.println("You will be charging Rs. 6,000 per night");
			roomPrice = 6000.00;
		}
		default -> System.out.println("You have selected an Invalid room type");

		}

		System.out.println("How many guests will occupy the room?");
		int noOfGuests = sc.nextInt();

		boolean isValidBooking = true;

		if (noOfGuests <= 0) {

			isValidBooking = false;
			System.out.println("Invalid No of Guests! Must be atleast 1");

		}
		if (roomType.equalsIgnoreCase("sui") && noOfGuests > 6) {

			isValidBooking = false;
			System.out.println("Suite can accomodate upto 6 guests!");
		}
		if (roomType.equalsIgnoreCase("del") && noOfGuests > 4) {

			isValidBooking = false;
			System.out.println("Deluxe Room can accomodate upto 4 guests!");
		}
		if (roomType.equalsIgnoreCase("std") && noOfGuests > 2) {

			isValidBooking = false;
			System.out.println("Standard Room can accomodate upto 2 guests!");
		}
		if(isValidBooking) {
			System.out.println("Guest Details accepted. Continue with your Reservation!");
		}else {
			System.out.println("Unable to proceed with this booking. Please review the guest details.");
		}
		
		System.out.println("How many nights are you staying?");
		
		int stayAtNight = sc.nextInt();
		double roomCharges = 0.0;
		
		if(stayAtNight <= 0 || stayAtNight > 30) {
			isValidBooking = false;
			System.out.println("You can only book from 1 to 30.");
		}
		
		if(isValidBooking) {
			roomCharges = roomPrice * stayAtNight;
			System.out.println("Room price is: ₹"+roomCharges);
		}else {
			System.out.println("Booking cannot proceed. Please review the details above.");
		}
		
		System.out.println("Do you need any add-ons?");
		String addOns = sc.next();
		
		double breakFastPrice = 0.0;
		double airportPickup = 0.0;
		
		switch(addOns) {
		case "bf" -> {
			
			
			if(isValidBooking) {
				
				breakFastPrice = 300.00 * noOfGuests * stayAtNight;
				System.out.println("Thank you for choosing breakfast Add-on");
				System.out.println("The total price for break fast is :"+breakFastPrice);
			}
		}
		case "ap" -> {
			if(isValidBooking) {
				airportPickup = 800.00;
				System.out.println("Total Airport pickup charges is :"+airportPickup);
			}
			
		
		}
		case "both" -> {
			if(isValidBooking) {
			
				double chargesForbothAddOn = 300.00 * noOfGuests * stayAtNight + 800.00;
				System.out.println("Charges for both Add-ons is :"+chargesForbothAddOn);
			}
			
		}
		case "none"-> System.out.println("No Additional Services selected. Proceeding to the Billing");
		
		}
		
		

	}
}
