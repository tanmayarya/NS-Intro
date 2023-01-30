package Arrays;

public class Arrays2dQuestions {

	public static void printZigZag(int arr[][]) {
		for(int row = 0; row < arr.length; row++) {
			if(row % 2 == 0) { // row is even
				for(int col = 0; col < arr[row].length; col++) {
					System.out.println(arr[row][col]);
				}
			} else { // row is odd
				for(int col = arr[row].length - 1; col >=0; col--) {
					System.out.println(arr[row][col]);	
				}
			}
			
		}
	}
	
	public static void postiveDiagonal(int arr[][]) {
		// number of rows
		int m = arr.length;
		// number of columns
		int n = arr[0].length;
		// first half
		for(int d = 1; d <= n; d++) {
			
			//print 1 diagonal
			for(int r = 0, c = n - d;r < m && c < n; r++, c++) {
				System.out.println(arr[r][c]);
			}
		}
		
		// second half
		for(int d = 1; d <= m - 1; d++) {
			//print 1 diagonal
			for(int r = d, c = 0; r <m && c < n; r++, c++) {
				System.out.println(arr[r][c]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[][] = {
				{ 1,  2,  3,  4,  5},
				{ 6,  7,  8,  9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
				};
		
//		printZigZag(arr);
		postiveDiagonal(arr);
	}
}
