package com.java.dsa.Arrays;


public class SecondLargestElement {
	public static void main(String[] args) {
		
		int[] arr = {2,7,13,9,8,13};
		
		int maxElement = -1;
		int secondMaxElement = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > maxElement) {
				secondMaxElement = maxElement;
				maxElement = arr[i];
			} else if(arr[i] < maxElement && arr[i] > secondMaxElement) {
				
				secondMaxElement = arr[i];
			}		
		
		}
		System.out.println("Max element : "+maxElement);
		System.out.println("Second Largest Element : "+secondMaxElement);
	}

}
