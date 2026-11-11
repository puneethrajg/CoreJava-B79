package com.java.dsa.Arrays;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the elements in Array :");
		for(int ele = 0; ele < size; ele++) {
			
			arr[ele] = sc.nextInt();
			
		}
		
	}
}

