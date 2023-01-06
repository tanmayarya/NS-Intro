package Arrays;

public class Basics {
	
	public static void sum(int arr[]) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i]; // total = total + arr[i];
		}
		System.out.println(total);
	}
	
	public static void max(int arr[]) {
		int currMax = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > currMax) { // found the new max
				currMax = arr[i];
			}
		}
		System.out.println(currMax);
	}

	public static void main(String[] args) {
		int arr[] = {2, 1, 7, 9, 4, 3};
//		sum(arr);
		max(arr);
	}
	

}
