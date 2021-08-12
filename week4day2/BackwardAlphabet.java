package week4day2;

public class BackwardAlphabet {

	public static void main(String[] args) {
		
		// If I call printBackwardAlphabet('d'), I want to see: d, c, b, a
		// If I call printBackwardAlphabet('f'), I want to see: f, e, d, c, b, a
		
//		printBackwardAlphabetByLoop('d');
//		printBackwardAlphabetByLoop('f');
//		printBackwardAlphabetByLoop('z');
		
//		printBackwardAlphabetByRecursion('d');
		printBackwardAlphabetByRecursion('f');
	}
	
	public static void printBackwardAlphabetByLoop(char startChar) {
		char currChar = startChar;
		while (currChar != 'a') {
			System.out.print("" + currChar + ", ");
			currChar = (char) (currChar - 1);
		}
		
		System.out.print("" + currChar);
		System.out.println();
	}
	
	public static void printBackwardAlphabetByRecursion(char startChar) {
		
		if (startChar == 'a') {// base case (simplest case)
			System.out.println("a");
		} else {
			System.out.print("" + startChar + ", ");
			printBackwardAlphabetByRecursion((char)(startChar - 1));
		}

	}

}
