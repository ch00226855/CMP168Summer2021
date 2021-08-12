package week4day2;

public class RecursionExamples {

	public static void main(String[] args) {
		
//		System.out.println(factorial(10));
//		System.out.println(factorialByLoop(10));
		
//		for(int i = 0; i < 15; i++) {
//			System.out.println(fib(i));
//		}
		System.out.println(fib(4));

	}
	
	public static int factorial(int n) {
		// base case: factorial(1) = 1
		// recursive definition: factorial(n) = n * factorial(n-1)
		
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int factorialByLoop(int n) {
		int product = 1;
		for (int num = n; num >= 1; num--) {
			product *= num;
		}
		return product;
	}
	
	public static int fib(int n) {
		// recursive definition: fib(n) = fib(n-1) + fib(n-2)
		// base cases: fib(0) = 0, fib(1) = 1
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
		
	}
}
