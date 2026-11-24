package com.java.dsa.Arrays;

public class RotateArray {

	
	void rotateArray() {

	}
	public void reverseArray(int [] arr, int start, int end) {
			
			while(start < end) {
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int start = 0;
		int end = arr.length - 1;
		
		

	}

}
