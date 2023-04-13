package PrefixSum;

import java.util.*;

public class PrefixSum1 {
	
//	public static int toys(int arr[]) {
//		
//	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			// calculating prefix sum array
			arr[i] = arr[i] + arr[i-1];
		}
		
		while(q-- > 0) {
			int k = scn.nextInt();
			int numberOfToysPurchased = (int)Math.ceil(n * 1.0 / (k + 1));
			System.out.println(arr[numberOfToysPurchased - 1]);
		}
//		
//		
	}

}
