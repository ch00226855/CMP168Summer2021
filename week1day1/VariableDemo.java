package week1day1;

public class VariableDemo {
	
	public static void main(String[] args) {
		
		// compound operators
		
		int theYearTitanicSank = 1912;
		
		// increase the value by 5.
//		theYearTitanicSank = theYearTitanicSank + 5;
		theYearTitanicSank += 5;
		
		// increase the value by 1.
		theYearTitanicSank++;
		
		System.out.println(theYearTitanicSank); 
		// Output: 1918
		
		// double type is imprecise
		double x = 1.0 / 3.0;
		System.out.println("x:" + x);
		
		// int has limits (~2 billion)
		int y = 12345 * 54321 * 67890;
		System.out.println("y:" + y);
		
		long z = 12345;
		z *= 54321;
		z *= 67890;
		System.out.println("z:" + z);
		
		// format printing
		double piVal = 3.14159;
//		System.out.println(piVal);
		System.out.printf("%.3f", piVal);
		
		// scientific notation
		double w = 7.2e-4;
		System.out.println();
		System.out.printf("%f", w);
		System.out.println();
		
		// final variable
//		int monthsInYear = 12;
		final int MONTHS_IN_YEAR = 12;
//		MONTHS_IN_YEAR = 13; // this will create an error
		
	}
}
