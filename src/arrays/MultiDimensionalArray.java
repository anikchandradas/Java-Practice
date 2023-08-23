package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//12 X 8 Grid
		int[][] a = new int[12][8];
		int numRows = a.length;
		int numCols = a[0].length;
		
		//Filling the Array
		for(int row = 0; row < numRows; ++row) {
			for(int col = 0; col < numCols; ++col) {
				a[row][col] = row * numCols + col + 1;
			}
		}
		
		//Printing the array
		for(int row = 0; row < numRows; ++row) {
			for(int col = 0; col < numCols; ++col) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
	    } 
		
	}
}
