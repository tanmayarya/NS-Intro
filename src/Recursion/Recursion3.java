package Recursion;

public class Recursion3 {

	// TC ->  O(n)
	public static int power(int a, int b) {
		if(b == 0) return 1;
		int pabm1 = power(a, b - 1);
		return a * pabm1;
	}
	

	// TC ->  O(log(n)) Optimised
	public static int power2(int a, int b) {
		if(b == 0) return 1;
		int pab2 = power(a, b/2);
		if(b % 2 == 1) return pab2 * pab2 * a; // odd
		else return pab2 * pab2;
	}
	
	
	public static void print(int arr[], int idx) {
		if(idx == arr.length) return;
		
		System.out.println(arr[idx]);
		print(arr, idx + 1);
	}
	
	public static void printReverse(int arr[], int idx) {
		if(idx == arr.length) return;
		
		printReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}
	
	
	public static void main(String[] args) {
//		System.out.println(power2(2, 10));
		int arr[] = {1,2,3,4,5,6,7,8,9};
//		print(arr, 0);
		printReverse(arr, 0);
	}
}
