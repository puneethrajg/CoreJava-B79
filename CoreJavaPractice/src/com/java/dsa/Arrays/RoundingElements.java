package com.java.dsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RoundingElements {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements in Array :");
		for (int ele = 0; ele < arr.length; ele++) {

			arr[ele] = sc.nextInt();
		}
		
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			
			
				int ld = arr[i] % 10;
				if(ld > 5) {
					arr[i]=arr[i]+10-ld; 
				}else {
					arr[i]=arr[i]-ld;
				}
				
			
		
		}
		System.out.println("After Modifying Array :"+Arrays.toString(arr));
	}
	
	

}
