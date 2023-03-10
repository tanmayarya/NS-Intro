package Recursion;

public class Backtracking {
	
	public static void nQueens(int arr[][], int row) {
		if(row == arr.length) {
			printBoard(arr);
			return;
		}
			
		for(int i = 0; i < arr.length; i++) {
			if(isSafe(arr, row, i)) {
				arr[row][i] = 1; // place the queen
				
				nQueens(arr, row + 1);
				
				arr[row][i] = 0; // remove the queen
			}
		}
		
	}
	
	public static boolean isSafe(int arr[][], int row, int col) {
		
		// no need to check horizontally as we move to next row after placing a queen in 1 row
		
		// vertically
		for(int i = 0 ; i < row; i++) {
			if(arr[i][col] == 1) return false;
		}
		
		// left upper diagonal
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if(arr[i][j] == 1) return false;
		}
		
		// right upper diagonal
		for(int i = row, j = col; i >= 0 && j < arr.length; i--, j++)
			if(arr[i][j] == 1) return false;
		
		return true;
	}
	
	public static void printBoard(int arr[][]) {
		System.out.println("**********************");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		nQueens(arr, 0);
	}

}
