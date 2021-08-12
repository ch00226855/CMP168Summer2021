package week4day2;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] testAry = {1, 5, 2, 4, 8, 7};

		System.out.println(linearSearch(testAry, 4, 0));
		System.out.println(linearSearch(testAry, 7, 0));
		System.out.println(linearSearch(testAry, 6, 0));
		
//		System.out.println(linearSearchByLoop(testAry, 4));
//		System.out.println(linearSearchByLoop(testAry, 7));
//		System.out.println(linearSearchByLoop(testAry, 6));
	}
	
	public static int linearSearchByLoop(int[] ary, int target) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == target) {
				return i;
			}
		}
		return -1; // target value does not exist.
	}

	public static int linearSearch(int[] ary, int target, int startIndex) {
		
		// recursive step: compare target with one more value, and leave the rest to another method call.
		// startIndex represents the beginning of the unchecked part of the array
		// base case: if ary has 0 element left to check, then return -1
		if (startIndex == ary.length) {
			return -1;
		} else {
			if (ary[startIndex] ==  target) {
				return startIndex;
			} else {
				return linearSearch(ary, target, startIndex+1);
			}
		}
	}
}
