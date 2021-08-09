package finalprojectstarter;

public class Grid {
	
	private boolean[][] bombGrid;
	private int[][] countGrid;
	private int numRows;
	private int numColumns;
	private int numBombs;
	
	public Grid() {
		//10 rows, 10 columns, (10 x 10 Grid), 25 bombs
		numRows = 10;
		numColumns = 10;
		numBombs = 25;
		
		bombGrid = new boolean[numRows][numColumns];
		countGrid = new int[numRows][numColumns];
		createBombGrid();
		createCountGrid();
	}
	
	public Grid(int rows, int columns) {
		// TODO (rows x columns Grid), default value of 25 bombs 

	}
	
	public Grid(int rows, int columns, int numBombs) {
		// TODO (rows x columns Grid), numBombs as specified
		
		// If numBombs is greater than the total number of cells, report
		// the error.
		
		// Option 1: Print an error message and use 25 bombs instead.
		
		// Option 2: Throws a TooManyBombsException
		

	}
	
	public int getNumRows() {
		// TODO implement this!!
		return -1;
	}
	
	public int getNumColumns() {
		// TODO implement this!!
		return -1;
	}
	
	public int getNumBombs() {
		// TODO implement this!!
		return -1;
	}
	
	public boolean[][] getBombGrid() {
//		return bombGrid; // Error: we don't want user to modify bombGrid!
		
		// Return a copy of the grid.
		
		// 1. Create a new array of the same size.
		boolean[][] result = new boolean[numRows][numColumns];
		
		// 2. Use a loop to copy values
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				result[row][col] = bombGrid[row][col];
			}
		}
		return result;
	}
	
	public int[][] getCountGrid() {
		// TODO return a copy of the grid.
		return null;
	}
	
	public boolean isBombAtLocation(int row, int column) {
		// TODO implement this!
		return true;
	}
	
	public int getCountAtLocation(int row, int column) {
		// TODO implement this!
		
		return -1;
	}
	
	private void createBombGrid() {
		// Put true or false to each cell of bombGrid.
		// Pick the true cells randomly.
		// Make sure that there are exacts numBombs true cells.
		
		
		// Key: How to determine a single true cell?
		
		// 1. Put false to all cells
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				bombGrid[row][col] = false;
			}
		}
		
		// 2. Call placeOneBomb() numBombs times.
		for (int i = 0; i < numBombs; i++) {
			placeOneBomb();
		}
		
	}
	
	private void placeOneBomb() {
		// Pick a random row index
		int rowIndex = (int)(Math.random() * 10); // 0, 1, 2, ..., 8, 9.
		
		// Pick a random column index
		int colIndex = (int)(Math.random() * 10);
		
		if (!bombGrid[rowIndex][colIndex]) {// the cell does not contain a bomb
			bombGrid[rowIndex][colIndex] = true;
		} else {
			placeOneBomb(); // Use recursion to simplify the process.
		}
		
		// put true to the corresponding cell
//		bombGrid[rowIndex][colIndex] = true; // What if there is already a bomb?
		
//		if (!bombGrid[rowIndex][colIndex]) {// the cell does not contain a bomb
//			bombGrid[rowIndex][colIndex] = true;
//		} else { // the cell already contains a bomb
//			rowIndex = (int)(Math.random() * 10);
//			colIndex = (int)(Math.random() * 10);
//			if(!bombGrid[rowIndex][colIndex]) {
//				bombGrid[rowIndex][colIndex] = true;
//			} else {
//				rowIndex = (int)(Math.random() * 10);
//				colIndex = (int)(Math.random() * 10);
//				if(!bombGrid[rowIndex][colIndex]) {
//					bombGrid[rowIndex][colIndex] = true;
//				} else {
//					// THIS MAY NEVER END!!
//				}
//			}
//		}
		
		
	}
	
	private void createCountGrid() {
		// For every cell, count the number of bombs in its adjacent cells (including itself)
		
		// Key: how to calculate for one cell?
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				countGrid[row][col] = countBombsNearACell(row, col);
			}
		}
		
	}
	
	private int countBombsNearACell(int row, int column) {
		// rows: row-1, row, row+1
		// columns: column-1, column, column+1
		
		// Challenge: how to deal with out-of-bound index?
		
		// Solution 1: find the bound of index more precisely
//		int rowUpperBound = row + 1;
//		int rowLowerBound = row - 1;
//		int colUpperBound = column + 1;
//		int colLowerBound = column - 1;
//		
//		if (row == 0) { // first row
//			rowLowerBound = 0;
//		}
//		
//		if (row == numRows - 1) { // last row
//			rowUpperBound = numRows - 1;
//		}
//		
//		if (column == 0) { // leftmost column
//			colLowerBound = 0;
//		} 
//		
//		if (column == numColumns - 1) { // rightmost column
//			colUpperBound = numColumns - 1;
//		}
//		
//		int sum = 0;
//		for (int i = rowLowerBound; i <= rowUpperBound; i++) {
//			for (int j = colLowerBound; j <= colUpperBound; j++) {
//				if (bombGrid[i][j]) {
//					sum++;
//				}
//			}
//		}
		
		// Solution 2: embrace ArrayIndexOutOfBoundException
		int sum = 0;
		for (int i = row-1; i <= row+1; i++) {
			for (int j = column-1; j <= column+1; j++) {
				try {
					if (bombGrid[i][j]) {
						sum++;
					}
				} catch (Exception e) { } // ignore possible exception
			}
		}

		return sum;
	}
	
	/////////////////////////////////////////////////////////////
	// For testing only
	public void printBombGrid() {
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				if (bombGrid[row][col]) {
					System.out.print("| * ");
				} else {
					System.out.print("|   ");
				}
			}
			System.out.println("|");
		}
		
	}
	
	public void printCountGrid() {
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				System.out.print("| " + countGrid[row][col] + " ");
			}
			System.out.println("|");
		}
	}
}
