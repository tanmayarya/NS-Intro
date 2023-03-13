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
