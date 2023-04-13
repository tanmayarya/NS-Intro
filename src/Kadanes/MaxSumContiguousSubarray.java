package Kadanes;

public class MaxSumContiguousSubarray {

	public static int maxSumContiguousSubarray(int arr[]) {
		// Kadanes algo
		int sum = 0, maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(sum < 0) sum = 0;
			sum += arr[i];
			if(sum > maxSum) maxSum = sum;
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSumContiguousSubarray(arr));

	}

}
