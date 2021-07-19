package week1day1;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		
		// Format output
		String account = "Prime";
		double total = 210.35;
		int years = 5;

		System.out.printf("The %10s account saved you $%.2f over %+d years\n",
		    account, total, years);
		
		// Calculate the absolute value
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int val = scnr.nextInt();
		
		if (val < 0) {
			// this block is executed when val < 0.
			val = -val;
		}
		
		System.out.println("absolute value: " + val);
		
		// Calculate the maximum of two values.
		System.out.println("Enter two integers:");
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int max;

		if (x > y) {
			max = x;
		} else {
			max = y;
		}
		
		System.out.println("The max: " + max);
		
		// Multiple if-else statements
		System.out.println("How many years have you been married?");
		int yearsMarried = scnr.nextInt();
		
		if (yearsMarried == 1) {
			System.out.println("Newly weds!");
		} else if (yearsMarried == 25) {
			System.out.println("Silver marrige!");
		} else if (yearsMarried == 50) {
			System.out.println("Golden marrige!");
		} else {
			System.out.println("Congrats!");
		}
	}

}
