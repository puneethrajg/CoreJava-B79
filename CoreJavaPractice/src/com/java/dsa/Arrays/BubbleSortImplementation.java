package com.java.dsa.Arrays;

import java.util.Arrays;

public class BubbleSortImplementation {
	
	//Sorting in Ascending order
	public void bubbleSort(int [] arr) {
		
		
		
		System.out.println("Array before :"+Arrays.toString(arr));
		for(int i = 0; i < arr.length-1; i++) {
			boolean flag = false;
			
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
					
				}
			}
			if(!flag) {
				break;
			}
		}
		
		System.out.println("Array after :"+Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
		BubbleSortImplementation bs = new BubbleSortImplementation();
		int [] arr = {1,2,3,4,5,6};
		
		bs.bubbleSort(arr);
			
	}
}
