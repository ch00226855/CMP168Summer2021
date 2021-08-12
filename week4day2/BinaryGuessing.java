package week4day2;

import java.util.Scanner;

public class BinaryGuessing {

	public static void main(String[] args) {
		
		System.out.println("Please think of a number between 0 and 1000. I will try to guess it.");
		
		Scanner scnr = new Scanner(System.in);
		char userInput = ' '; // r - right, h - too high, l - too low.
		int guess = -1;
		int lowerBound = 0;
		int upperBound = 1000;
		int numGuesses = 0;
		
		while(userInput != 'r') {
			guess = guessNumber(lowerBound, upperBound);
			System.out.println("Is the number " + guess + "?");
			System.out.println("Please reply r(right)/h(too high)/l(too low):");
			userInput = scnr.nextLine().charAt(0);
			numGuesses++;
			
			switch(userInput) {
			case 'l':
				lowerBound = guess;
				break;
			case 'h':
				upperBound = guess;
				break;
			default:
				break;
			}
		}
		
		System.out.println("I guessed the number using " + numGuesses + " guesses.");
		

	}
	
	public static int guessNumber(int lowerBound, int upperBound) {
		return (lowerBound + upperBound) / 2;
	}

}
