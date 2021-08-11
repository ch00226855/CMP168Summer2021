package week4day3;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] ary = {2384, 38, 2, 5, 75, 423, 13, 35, 46, 34, 5464, 241, 4221};
		
		mergeSort(ary, 0, ary.length-1);
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}

	}
	
	public static void mergeSort(int[] ary, int startIndex, int endIndex) {
		
		// base case: there is 1 element in the array, then array is already sorted.
		if (startIndex >= endIndex) {
			return;
		}
		
		// recursive case: split the arry into two halves, sort both sub arrays, and merge the values together
		if (startIndex < endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			mergeSort(ary, startIndex, midIndex);
			mergeSort(ary, midIndex+1, endIndex);
//			System.out.println("Merging: Start Index: " + startIndex + ", Middle Index: " + midIndex + ", End Index: " + endIndex);
			// merge: create a new array to store the sorted array, and then copy the values to the original array.
			int[] tempAry = new int[endIndex + 1 - startIndex];
			int indFirstHalf = startIndex;
			int indSecondHalf = midIndex + 1;
			int indTempAry = 0;
			
			while(indFirstHalf <= midIndex || indSecondHalf <= endIndex) {
//				System.out.println("-- First Index: " + indFirstHalf +
//						", Second Index: " + indSecondHalf);
				if (indFirstHalf > midIndex) { // no more value left in the first half
					tempAry[indTempAry] = ary[indSecondHalf];
					indSecondHalf++;
					indTempAry++;
					continue;
				}
				
				if (indSecondHalf > endIndex) {// no more value left in the second half
					tempAry[indTempAry] =  ary[indFirstHalf];
					indFirstHalf++;
					indTempAry++;
					continue;
				}
				
				// this only occurs if both halves contain values.
				if (ary[indFirstHalf] < ary[indSecondHalf]) {
					tempAry[indTempAry] =  ary[indFirstHalf];
					indFirstHalf++;
					indTempAry++;
				} else {
					tempAry[indTempAry] = ary[indSecondHalf];
					indSecondHalf++;
					indTempAry++;
				}
			}
//			System.out.print("First Half: ");
//			for (int i = startIndex; i <= midIndex; i++) {
//				System.out.print(ary[i] + " ");
//			}
//			System.out.println();
//			
//			System.out.print("Second Half: ");
//			for (int i = midIndex+1; i <= endIndex; i++) {
//				System.out.print(ary[i] + " ");
//			}
//			System.out.println();
//			
//			
//			System.out.print("TempAry: ");
//			for (int i = 0; i < tempAry.length; i++) {
//				System.out.print(tempAry[i] + " ");
//			}
//			System.out.println();
			
			for (int i = 0; i < tempAry.length; i++) {
				ary[startIndex + i] = tempAry[i];
			}
//			System.out.print("Array: ");
//			for (int i = 0; i < ary.length; i++) {
//				System.out.print(ary[i] + " ");
//			}
//			System.out.println();
		}
	}

}
