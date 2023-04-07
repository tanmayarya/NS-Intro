package Queues;

import java.util.*;

public class SlidingWindow {
	
	public static boolean BobsInterview(int arr[], int k , int x) {
		int interviewsCleared = 0;
		for(int i = 0; i < k; i++) {
			interviewsCleared += arr[i];
		}
		if(interviewsCleared >= x) return true;
		for(int i = k; i < arr.length; i++) {
			interviewsCleared -= arr[i-k];
			interviewsCleared += arr[i];
			if(interviewsCleared >= x) return true;
		}
		return false;
	}
	
	public static int alternateString(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			int curr = s.charAt(i) - '0';
			if(curr != (i % 2)) count++;
		}
		int alternateCount = s.length() - count;
		return Math.min(count, alternateCount);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(alternateString(s));
	}
}
