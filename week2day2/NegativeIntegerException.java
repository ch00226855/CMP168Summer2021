package week2day2;

public class NegativeIntegerException extends Exception {
	
	private int integer;
	
	public NegativeIntegerException(int integer) {
		super("Negative integer occured: " + integer);
		this.integer = integer;
	}
	
	public int getInteger() {
		return this.integer;
	}

}
