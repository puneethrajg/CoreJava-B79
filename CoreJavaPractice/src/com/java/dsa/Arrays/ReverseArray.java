package com.java.dsa.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("Array After reversal :"+Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 5, 10 , 15, 20, 25 };
		System.out.println("Array before :"+Arrays.toString(arr));
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i++];
		}
		System.out.println(sum);
		ReverseArray.reverseArray(arr);
	}
}
