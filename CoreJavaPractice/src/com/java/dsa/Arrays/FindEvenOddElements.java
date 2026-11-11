package com.java.dsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvenOddElements {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the elements into Array :");
		
		for(int ele = 0; ele < size; ele++) {
			
			arr[ele] = sc.nextInt();
		}
		System.out.println("Elements in Array :"+Arrays.toString(arr));
		
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0; i < size; i++) {
			
			if(arr[i] % 2 == 0) {
				
				evenCount ++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Even Element Count :"+evenCount);
		
		System.out.println("Odd Element Count :"+oddCount);
	}
	

}
