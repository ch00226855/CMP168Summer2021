package week1day3;

public class OversizedArrayDemo {
	
	public static int addElement(int[] ary, int size, int elt) {
		
		// add the new elt to ary, increment and return the size
		
		// Check if there is room for the new element.
		if (size >= ary.length) {
			System.out.println("The array is already full.");
		} else {
			ary[size] = elt;
			size++;
		}
		
		return size;
		
	}

	public static void main(String[] args) {
		
		// Create an oversized array
		int[] salesTransactions = new int[1000];
		int salesTransactionsSize = 0;
		
		// Add a new element 12345 to the array.
		salesTransactions[salesTransactionsSize] = 12345; // current size is 0
		salesTransactionsSize++; // increase the size of array.
		
		// Add another element 67890 to the array.
		salesTransactions[salesTransactionsSize] = 67890; // current size is 1
		salesTransactionsSize++;
		
		// Add another element 98765 to the array.
		salesTransactionsSize = addElement(salesTransactions, salesTransactionsSize, 98765);
		System.out.println(salesTransactions[2]);
		
		int[] ary2 = new int[5];
		ary2[0] = 0;
		ary2[1] = 1;
		ary2[2] = 2;
		ary2[3] = 3;
		ary2[4] = 4;
		int arySize = 5;
		arySize = addElement(ary2, arySize, 6);
	}

}
