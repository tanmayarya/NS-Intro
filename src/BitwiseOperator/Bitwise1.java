package BitwiseOperator;

import java.util.Scanner;

public class Bitwise1 {
	
	public static int findUnique(int arr[]) {
		int ans = 0;
		for(int i = 0; i <arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
	
	
	public static long cyclicLeftShift(int n) {
		long maxValue = n;
		
		for(int i = 1; i <= 32; i++) {
			long currentIteration = (n << i) | (n >> (32 - i));
			if(currentIteration > maxValue) {
				maxValue = currentIteration;
			}
		}
		
		return maxValue;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(findUnique(arr));
	}

}
