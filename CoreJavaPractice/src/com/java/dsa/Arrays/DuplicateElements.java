package com.java.dsa.Arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int [] arr = {1,4,7,2,1,4,7,8,6,9};
		
		int isVisited[] = new int[arr.length];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > 1) System.out.println("Duplicate Elements :"+arr[i]);
			/* First Non Repeating Element
			 * if(count ==1) { System.out.println("First Non - repeating Elements"arr[i]); break; }
			 */
			
			
		}
	}

}
