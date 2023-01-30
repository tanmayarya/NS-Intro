package SearchingAndSorting;

import java.util.Scanner;

public class Sorting {
	
	public static boolean isSortedAndRotated(int arr[]) {
		int minIdx = 0, maxIdx = 0;
		for(int i = 1; i <arr.length; i++) {
			if(arr[i] > arr[maxIdx]) { // found new max
				maxIdx = i;
			}
			if(arr[i] < arr[minIdx]) { // found new min
				minIdx = i;
			}
		}
		
		if(maxIdx == minIdx - 1) {
			// sorted in ascending order
			
			if(arr[0]  < arr[arr.length - 1])
				return false;
			
			for(int i = 1; i < arr.length; i++) {
				int prev = arr[i-1], curr = arr[i];
				if(prev > curr && i != minIdx) {
					return false;
				}
			}
			return true;
			
		} else if(maxIdx == minIdx + 1) {
			// sorted in descending order
			// 4 3 8 7 6 5 
			
			if(arr[0]  > arr[arr.length - 1])
				return false;
			
			for(int i = 1; i < arr.length; i++) {
				int prev = arr[i-1], curr = arr[i];
				if(prev < curr && i != maxIdx) {
					return false;
				}
			}
			return true;
			
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			boolean ans = isSortedAndRotated(arr);
			System.out.println(ans ? "Yes": "No");
		}
		
	}
}
