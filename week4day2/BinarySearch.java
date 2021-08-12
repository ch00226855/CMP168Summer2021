package week4day2;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] testAry = {1, 3, 5, 8, 11, 23, 45, 65};
		
		System.out.println(binarySearch(testAry, 11, 0, testAry.length-1));
		
		String[] names = {"Alice", "Bob", "Brian", "Charle", "Clare", "David", "Fred", "Nate", "Oliver", "Wendy", "Wesley"};
		
		System.out.println(binarySearch(names, "Seth", 0, names.length-1));
		

	}
	
	public static int binarySearch(int[] ary, int target, int lowerBound, int upperBound) {
		
		
		
		if (lowerBound > upperBound) { // base case: no value in the suspect area
			System.out.println("No more value left. Target not found.");
			return -1;
		} else { // recursive step: compare the middle value with target.
			int middleIndex = (lowerBound + upperBound) / 2;
			int middleVal = ary[middleIndex];
			System.out.println("Lower bound: " + lowerBound + ", upper bound: " + upperBound + ", current value: " + middleVal);
			if (target == middleVal) {
				System.out.println("Target value found. Index: " + middleIndex);
				return middleIndex;
			} else if (target > middleVal) {
				return binarySearch(ary, target, middleIndex + 1, upperBound);
			} else {
				return binarySearch(ary, target, lowerBound, middleIndex - 1);
			}
		}
	}
	
	public static int binarySearch(String[] ary, String target, int lowerBound, int upperBound) {
		if (lowerBound > upperBound) {
			return -1;
		} else {
			int middleIndex = (lowerBound + upperBound) / 2;
			String middleVal = ary[middleIndex];
			if (target.equals(middleVal)) {
				return middleIndex;
			} else if (target.compareTo(middleVal) > 0) {
				return binarySearch(ary, target, middleIndex+1, upperBound);
			} else {
				return binarySearch(ary, target, lowerBound, middleIndex-1);
			}
		}
	}

}
