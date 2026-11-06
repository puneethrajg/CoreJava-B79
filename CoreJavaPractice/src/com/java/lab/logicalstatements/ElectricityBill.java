package com.java.lab.logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

	
	static String connectionType;
	
	static int unitsConsumed;
	
	static double totalBill = 0;
	
	static int pricePerUnit;
	
	public static void displayBill() {
		
		System.out.println("Connection Type : "+connectionType);
		System.out.println("Units Consumed : "+unitsConsumed);
		System.out.println("Charge per Unit : "+pricePerUnit);
		System.out.println("Total Electricity Bill : "+totalBill);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Connection Type :");
		connectionType = sc.next().toUpperCase();
		
		System.out.println("Enter Units consumed :");
		unitsConsumed = sc.nextInt();
		
		switch(connectionType) {
		
		case "DOMESTIC" -> {
			if(unitsConsumed <= 100) {
				
				pricePerUnit = 2;
			}else if(unitsConsumed > 300 ) {
				
				pricePerUnit = 3;
				
			}
			totalBill += unitsConsumed * pricePerUnit;
			
		}
		case "COMMERCIAL" -> {
			
			if(unitsConsumed <= 100) {
				pricePerUnit = 4;
				
			}else if(unitsConsumed <= 300) {
				pricePerUnit = 8;
			}
			totalBill += unitsConsumed * pricePerUnit;
		}
		default -> {
			System.out.println("Please enter correct Connection Type!");
			return;
		}
	}
		displayBill();
	
		
	}
	
	
		
}

