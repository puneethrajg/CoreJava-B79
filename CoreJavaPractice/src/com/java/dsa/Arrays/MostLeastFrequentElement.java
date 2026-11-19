package com.java.dsa.Arrays;

public class MostLeastFrequentElement {

	public static void main(String[] args) {
		int [] arr  = {10,20,10,40,30,70,30,90,50};
		
//		For finding Most Frequency Element
		int maxCount = 0;
		int mostFrequent = Integer.MIN_VALUE;
		
//		For finding Least Frequency Element
		int leastCount = Integer.MAX_VALUE;
		int leastFrequent = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			int count = 0;

			
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					count++;
				}
			}
			
//			Most Frequency Logic
			if(count > maxCount) {
				maxCount = count;
				mostFrequent = arr[i];
			}
			
//			Least Frequency Logic
			if(count < leastCount) {
				leastCount = count;
				leastFrequent = arr[i];
			}
			
		}
		
		System.out.println("Most Frequent Element : "+mostFrequent);
		System.out.println("Frequency : "+maxCount);
		
		System.out.println();
		
		System.out.println("Least Frequency Element : "+leastFrequent);
		System.out.println("Frequency : "+leastCount);
	}
}
