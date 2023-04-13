package Kadanes;

import java.util.*;

public class MaxSumCircularSubarray {
	
	public static int negativeKadanes(int arr[]) {
		// negative Kadanes algo
		int sum = arr[0], minSum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(sum > 0) sum = 0;
			sum += arr[i];
			if(sum < minSum) minSum = sum;
		}
		return minSum;
	}
	
	public static int Kadanes(int arr[]) {
		int sum = arr[0], max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(sum < 0) sum = 0;
			sum += arr[i];
			if(sum > max) max = sum;
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int t = Integer.parseInt(scn.nextLine());
		while(t-- > 0) {
			int n = Integer.parseInt(scn.nextLine());
            String str = scn.nextLine();
            String s[] = str.split(" ");
			int arr[] = new int[n];
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(s[i]);
				sum += arr[i];
			}
			int ans;
			int positiveKadanes = Kadanes(arr);
			int negativeKadanes = negativeKadanes(arr);
			if(negativeKadanes == sum) ans = positiveKadanes;
			else ans = Math.max(positiveKadanes, sum - negativeKadanes);
			System.out.println(ans);
		}
	}

}
