package com.java.dsa.Arrays;

import java.util.Arrays;

public class MoveZerostoEnd {
	
	public static void main(String[] args) {
	
		int[] arr = {1,0,3,2,0,9,0,8,0,7};
		
		int left = 0;
		
		for(int right = 0; right < arr.length; right++) {
			
			
			if(arr[right] != 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
