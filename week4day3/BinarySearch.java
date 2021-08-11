package week4day3;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		Person alice = new Person("Alice", 1987, 12, 1);
		Person bob = new Person("Bob", 1978, 1, 12);
		Person charle = new Person("Charle", 2001, 3, 3);
		Person david = new Person("Daivd", 2002, 4, 4);
		Person eva = new Person("Eva", 1991, 5, 1);
		Person fred = new Person("Fred", 1967, 6, 7);
		Person gillian = new Person("Gillian", 2006, 6, 6);
		Person harry = new Person("Harry", 2007, 7, 8);
		
		Person[] ary = {fred, bob, alice, eva, charle, david, gillian};
		
		// Conduct binary search
		System.out.println("Index of target: " + binarySearch(ary, harry, 0, ary.length-1));
		
		
	}
	
	public static int binarySearch(Person[] ary, Person target, int startIndex, int endIndex) {
		System.out.println("Start index: " + startIndex + ", End index: " + endIndex);
		if (startIndex > endIndex) {// base case
			System.out.println("No more unchecked values. Target not found.");
			return -1;
		} else {
			int midIndex = (startIndex + endIndex) / 2;
			Person midPerson = ary[midIndex];
			int comparison = midPerson.compareTo(target); // target.compareTo(midPerson) will be different
			if (comparison == 0) {
				System.out.println("Target found! Index: " + midIndex);
				return midIndex;
			} else if (comparison < 0) {// target person in the second half
				System.out.println("Target in the second half. Keep looking...");
				return binarySearch(ary, target, midIndex+1, endIndex);
			} else { // target person in the first half
				System.out.println("Target in the first half. Keep looking...");
				return binarySearch(ary, target, startIndex, midIndex-1);
			}
		}
	}

}
