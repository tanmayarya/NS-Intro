package Recursion;

import java.util.Scanner;

public class Recursion4 {
	
	// insert operator
	public static boolean isPossible(long arr[], int eidx, long sum) {
		if(eidx == 0) return arr[0] == sum;
		
		boolean ans1 = isPossible(arr, eidx - 1, sum - arr[eidx]);
		boolean ans2 = isPossible(arr, eidx - 1, sum + arr[eidx]);
		return ans1 || ans2;
	}
	
	public static int tribnacci(int n) {
		if(n == 1 || n == 2) return 0;
		if(n == 3) return 1;
		
		return tribnacci(n - 1)
				+ tribnacci(n - 2)
				+ tribnacci(n - 3);
	}
	
	public static int countMazePath(int arr[][], int row, int col) {
		// negative base case (out of bound)
		if(row >= arr.length || col >= arr[0].length) return 0;
		
		// destination
		if(row == arr.length - 1 && col == arr[0].length - 1) 
			return 1;
		
		
		int noOfWaysFromRight = countMazePath(arr, row, col + 1);
		int noOfWaysFromDown = countMazePath(arr, row + 1, col);
		return noOfWaysFromDown + noOfWaysFromRight;
	}
	
	public static void printMazePath(int arr[][], int row, int col, String psf) {
		// negative base case (out of bound)
		if(row >= arr.length || col >= arr[0].length) return;
		
		// destination
		if(row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(psf);
			return;
		}
		
		printMazePath(arr, row, col + 1, psf + "R");
		printMazePath(arr, row + 1, col, psf + "D");
		
	}

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		long k = scn.nextLong();
//		long arr[] = new long[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scn.nextLong();
//		}
//		boolean ans = isPossible(arr, arr.length - 1, k);
//		System.out.println(ans ? "YES" : "NO");
		
//		System.out.println(tribnacci(6));
		
		int arr[][] = new int[3][3];
//		System.out.println(countMazePath(arr, 0, 0));
		printMazePath(arr, 0, 0, "");

	}

}
