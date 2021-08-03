package week3day2;

public class TwoDimArray {

	public static void main(String[] args) {

		// Create a 2D array that stores the driving distances between Boston, Chicago, and LA.
		int[][] drivingDistances = new int[3][3];
		
		// Assign values.
		drivingDistances[0][0] = 0;
		drivingDistances[0][1] = 960; 
		drivingDistances[0][2] = 2960;
		drivingDistances[1][0] = 960;
		drivingDistances[1][1] = 0; 
		drivingDistances[1][2] = 2011; 
		drivingDistances[2][0] = 2960; 
		drivingDistances[2][1] = 2011; 
		drivingDistances[2][2] = 0; 
				
		// ALTERNATIVE:
		int[][] drivingDistance2 = {{0, 960, 2960},
									{960, 0, 2011},
									{2960, 2011, 0}};
		// Find the maximum of a 2d array
		System.out.println(max2DArray(drivingDistances));
		System.out.println(min2DArray(drivingDistances));
		
	}

	public static int max2DArray(int[][] ary) {
		int maxSoFar = ary[0][0];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[0].length; j++) {
				if (maxSoFar < ary[i][j]) {
					maxSoFar = ary[i][j];
				}
			}
		}
		
		return maxSoFar;
	}
	
	public static int min2DArray(int[][] ary) {
		int minSoFar = ary[0][0];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[0].length; j++) {
				if (minSoFar > ary[i][j]) {
					minSoFar = ary[i][j];
				}
			}
		}
		
		return minSoFar;
	}
}
