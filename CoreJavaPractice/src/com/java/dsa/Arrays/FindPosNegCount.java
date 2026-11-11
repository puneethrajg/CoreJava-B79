package com.java.dsa.Arrays;

import java.util.Scanner;

public class FindPosNegCount {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter Elements in Array :");
		for(int ele = 0; ele <size; ele++) {
			
			arr[ele] = sc.nextInt();
		}
		
		int posCnt = 0;
		int negCnt = 0;
		
		for(int i = 0; i < size; i++) {
			
			if(arr[i] > 0) {
				posCnt++;
			}
			if(arr[i] < 0) {
				negCnt++;
			}
		}
		System.out.println("Positive Elements in Array :"+posCnt);
		System.out.println("Negative Elements in Array :"+negCnt);
	}

}
