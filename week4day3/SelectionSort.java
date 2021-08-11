package week4day3;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] ary = {2384, 38, 2, 5, 75, 423, 13, 35, 46, 34, 5464, 241, 4221};
		
		selectionSort(ary, 0);
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}

	}
	
	public static void selectionSort(int[] ary, int startIndex) {
		
		System.out.println("Start Index: " + startIndex);
		System.out.println("Current Array: ");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		// base case: there is only one value, the array is already sorted.
		if (startIndex < ary.length - 1) {
			
		// recursive case: find the smallest value between startIndex and the end of array,
			int minValue = ary[startIndex];
			int minIndex = startIndex;
			for (int i = startIndex; i < ary.length; i++) {
				if (minValue > ary[i]) {
					minValue = ary[i];
					minIndex = i;
				}
			}
		// 		then swap this value with the value on startIndex.
			ary[minIndex] = ary[startIndex];
			ary[startIndex] = minValue;
			selectionSort(ary, startIndex+1);
		}
	}

}
