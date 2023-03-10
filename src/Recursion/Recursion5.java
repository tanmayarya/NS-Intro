package Recursion;

public class Recursion5 {
	
	public static int countMazePath(int arr[][], int row, int col) {
		
		if(row >= arr.length || col >= arr[0].length)
			return 0;
		
		if(row == arr.length - 1 && col == arr[0].length - 1)
			return 1;
		
		int waysFromRight = countMazePath(arr, row, col + 1);
		int waysFromDown = countMazePath(arr, row + 1, col);
		
		return waysFromDown + waysFromRight;
		
	}
	
	public static void printMazePath(int arr[][], int row, int col, String psf) {
		
		if(row >= arr.length || col >= arr[0].length)
			return;
		
		if(row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(psf);
			return;
			
		}
			
		printMazePath(arr, row, col + 1, psf + "R");
		printMazePath(arr, row + 1, col, psf  + "D");
	}
	
	public static int countStairPath(int step) {
		if(step < 0) return 0; // negative base case
		if(step == 0) return 1; // you are on ground(positive base case)
		
		return countStairPath(step - 1) // jump of size 1
		+ countStairPath(step - 2)  // jump of size 2
		+ countStairPath(step - 3);  // jump of size 3
	} 

	public static void printStairPath(int step, String psf) {
		if(step < 0) return; // negative base case
		if(step == 0) { // you are on ground(positive base case)
			System.out.println(psf);
		}
		
		printStairPath(step - 1, psf + "1 "); // jump of size 1
		printStairPath(step - 2, psf + "2 ");  // jump of size 2
		printStairPath(step - 3, psf + "3 ");  // jump of size 3
	}
	
	
	public static void main(String[] args) {
//		int arr[][] = new int[4][4];
//		System.out.println(countMazePath(arr, 0, 0));
//		printMazePath(arr, 0, 0, "");
		
		System.out.println(countStairPath(5));
		printStairPath(5, "");

	}

}
