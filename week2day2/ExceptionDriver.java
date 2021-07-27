package week2day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDriver {
	
	public static double computeSquareRoot(double x) throws Exception {
		
		if (x >= 0) {
		
			return Math.sqrt(x);
		} else {
			throw new Exception("Negative input.");
		}
		
	}
	
	public static double computeSquareAndSquareRoot (double x) throws Exception {
		System.out.println("Square: " + x * x);
		double squaredRoot = computeSquareRoot(x);
		System.out.println("Square root: " + squaredRoot);
		return squaredRoot;
	}

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Husky", 50.0);
		Dog d2 = new Dog("Chihuahua", -10.0);
		
		// Example of InputMismatchException
		Scanner scnr = new Scanner(System.in);
		int userInt = 0;
		try {
			System.out.println("Enter an positive integer:");
			userInt = scnr.nextInt();
			if (userInt <= 0) {
//				throw new Exception("Negative integer.");
				throw new NegativeIntegerException(userInt);
			}
			System.out.println("User entered: " + userInt);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("We should ask user to enter again.");
		} catch (NegativeIntegerException e) {
			System.out.println(e.getMessage());
			System.out.println("Assign the absolute value to the variable.");
			userInt = Math.abs(e.getInteger());
		} 
		
		System.out.println("Value of userInt: " + userInt);
		
		
		System.out.println("----------------------");
		try {
			double result = computeSquareAndSquareRoot(-4.0);
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of program.");

	}

}
