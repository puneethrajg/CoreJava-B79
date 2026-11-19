package com.java.dsa.SortingTechniques;

import java.util.Arrays;

public class SelectionSortingImplementation {
	
	
	public static void selectionSort(int [] arr){
		

		for(int i = 0; i < arr.length-1; i++) {
			
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[j] < arr[minIndex]) {
					
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex]  = temp;
		}
		
		System.out.println("Array after sorting (Selection Sort) :" +Arrays.toString(arr));
	}
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,40,60,50,70,90,80};
		
		SelectionSortingImplementation.selectionSort(arr);
		
	}

}
