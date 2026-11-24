package com.java.dsa.Arrays;

import java.util.Arrays;

// I/P -> [10,20,30,40,50,60]
// O/P -> [30,50,70,90,110]
public class AdditionofNextandPreviousElem {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		
		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {

				res[i] = arr[i] + arr[i+1];
			} else if (i== arr.length-1) {

				res[i] = arr[i] + arr[i-1];
			} else {

				res[i] = arr[i-1] + arr[i+1];
			}

		}
		System.out.println("Array :"+Arrays.toString(res));
	}
	

}
