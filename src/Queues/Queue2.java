package Queues;

import java.util.*;

public class Queue2 {
	
	public static void maxEveryKSizedSubarray(int arr[], int k) {
		Deque<Integer> q = new LinkedList<>();
		
		// analyze the first window
		for(int i = 0; i < k; i++) {
			while(!q.isEmpty() && arr[i] > arr[q.peekLast()])
				q.pollLast();
			
			q.addLast(i);
		}
		System.out.print(arr[q.peekFirst()] + " ");
		
		// analyze for the remaining array
		for(int i = k; i < arr.length; i++) {
			// remove all the elements out of current window
			while(!q.isEmpty() && q.peekFirst() <= i - k)
				q.pollFirst();
			
			// remove all the smaller elements then current
			while(!q.isEmpty() && arr[i] > arr[q.peekLast()])
				q.pollLast();
			
			// add current element
			q.addLast(i);
			
			// print answer for current window
			System.out.print(arr[q.peekFirst()] + " ");
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int k = sc.nextInt(); // size of subarray
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxEveryKSizedSubarray(arr, k);
	}
}
