package Arrays;

import java.util.Scanner;

public class AssignmentQuestions {

	public static void MohitAndArray() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n-1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int val = 0;
		// zor from 1 to n
		for(int i = 1; i <= n; i++) {
			val = val ^ i;
		}
		
		// zor all the elements of the array
		for(int i = 0; i < arr.length; i++) {
			val = val ^ arr[i];
		}
		
		System.out.println(val);
	}
	
	public static int countSubarrays(int n) {
		return (n*(n+1))/2;
	}
	
	public static void oddArray() {
		// input
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int i = 0, count = 0, totalSubArrays = 0;
		boolean wasLastNumberOdd = false;
		
		for(i = 0; i < arr.length; i++) {
			// starting of sequence
			// last number is even current number is odd
			if(arr[i] % 2 == 1 && !wasLastNumberOdd) {
				count = 1;
				wasLastNumberOdd = true;
			}
			
			// continuation
			// last number was odd and current number is also odd
			else if(wasLastNumberOdd && arr[i] % 2 == 1) { 
				count++;
			}
			
			// ending a sequence
			// last number was odd and current number is even
			else if(wasLastNumberOdd && arr[i] % 2 == 0) {
				totalSubArrays += countSubarrays(count);
				wasLastNumberOdd = false;
				count = 0;
			} 
		}
		if(wasLastNumberOdd) {
			totalSubArrays += countSubarrays(count);
			wasLastNumberOdd = false;
		}
		System.out.println(totalSubArrays);
		
	}
	
	public static void main(String[] args) {
//		MohitAndArray();
		oddArray();
	}
	
}
