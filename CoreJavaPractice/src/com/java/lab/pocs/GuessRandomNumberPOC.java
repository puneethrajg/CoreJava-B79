package com.java.lab.pocs;

import java.util.Scanner;

import java.util.Random;

//Looping and Conditional Statements POC

public class GuessRandomNumberPOC {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		String playAgain;

		
		// UNCOMMENT TO KNOW THE RANDOM GENERATED NUMBER
		// System.out.println("Random Number is : "+randomNumber);

		boolean isWin = false;
		int randomNumber = rd.nextInt();

		do {

			for (int chancesRemain = 3; chancesRemain > 0; chancesRemain--) {
				
				
				System.out.println("Enter a number :");
				
				int userNumber = sc.nextInt();
				if (userNumber == randomNumber) {
					System.out.println("Congrats! You guessed the correct number. Random Number is : " + randomNumber);
					isWin = true;
					break;
				} else if (userNumber > randomNumber) {
					System.out.println("Too High! Try Again");

				} else {

					System.out.println("Too Low! Try Again");
				}
				System.out.println("Chances Remain : " + chancesRemain);

			}

			System.out.println("Do you want to Play Again (Y/N) :");
			playAgain = sc.next();
		} while (playAgain.equalsIgnoreCase("Y"));
		if (!isWin) {
			System.out.println("Game Over!");
			System.out.println("Correct Number is :" + randomNumber);
		}

	}

}
