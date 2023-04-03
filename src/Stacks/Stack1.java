package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	public static void nextSmallerElementOnLeft(int arr[]) {
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && st.peek() > arr[i])
				st.pop();
			
			if(st.isEmpty())
				System.out.println(-1);
			else System.out.println(st.peek());
			
			st.push(arr[i]);
		}
	}
	
	public static void nextSmallerElementOnRight(int arr[]) {
		Stack<Integer> st = new Stack<>();
		int ns[] = new int[arr.length];
		for(int i = arr.length - 1; i >= 0; i--) {
			while(!st.isEmpty() && st.peek() > arr[i])
				st.pop();
			
			if(st.isEmpty())
				ns[i] = -1;
			else ns[i] = st.peek();
			
			st.push(arr[i]);
		}
		for(int i = 0; i < ns.length; i++) {
			System.out.print(ns[i] + " ");
		}
	}
	
	public static void nextGreaterElementOnLeft(int arr[]) {
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && st.peek() <= arr[i])
				st.pop();
			
			if(st.isEmpty())
				System.out.println(-1);
			else System.out.println(st.peek());
			
			st.push(arr[i]);
		}
	}
	
	public static void nextGreaterElementOnRight(int arr[]) {
		Stack<Integer> st = new Stack<>();
		int ng[] = new int[arr.length];
		for(int i = arr.length - 1; i >= 0; i--) {
			while(!st.isEmpty() && st.peek() <= arr[i])
				st.pop();
			
			if(st.isEmpty()) 
				ng[i] = -1;
			else ng[i] = st.peek();
			
			st.push(arr[i]);
		}
		
		for(int i = 0; i < ng.length; i++) {
			System.out.print(ng[i] + " ");
		}
	}
	
	public static void nextGreaterElementOnRight2(int arr[]) {
		int ng[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				ng[st.pop()] = arr[i];
			}
			
			st.push(i);
		}
		while(!st.isEmpty()) {
			ng[st.pop()] = -1;
		}

		for(int i = 0; i < ng.length; i++) {
			System.out.print(ng[i] + " ");
		}
	}
	
	
	public static int maxAreaRectangle(int arr[]) {
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int area = 0;
		
		for(int i = 0; i < arr.length; i++) {
			while(st.size() > 1 && arr[st.peek()] > arr[i]) {
				int height = arr[st.pop()];
				int rightBoundry = i;
				int leftBoundry = st.peek();
				int currArea = (rightBoundry - leftBoundry - 1) * height;
				if(currArea > area) area = currArea;
			}
			st.push(i);
		}
		
		while(st.size() > 1) {
			int height = arr[st.pop()];
			int rightBoundry = arr.length;
			int leftBoundry = st.peek();
			int currArea = (rightBoundry - leftBoundry - 1) * height;
			if(currArea > area) area = currArea;
		}
		
		return area;
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
//        nextGreaterElementOnLeft(A);
//        nextGreaterElementOnRight(A);
//        System.out.println();
//        nextGreaterElementOnRight2(A);
        System.out.println(maxAreaRectangle(A));
	}

}
