package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting1 {
	
	public static int[] mergeSort(int arr[], int si, int ei) {
		if(si == ei) {
			int res[] = new int[1];
			res[0] = arr[si];
			return res;
		}
		
		int mid = (si + ei)/2;
		int part1[] = mergeSort(arr, si, mid);
		int part2[] = mergeSort(arr, mid + 1, ei);
		return merge(part1, part2);
	}
	
	public static int[] merge(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		while(i < a.length) {
				c[k] = a[i];
				i++;
				k++;
		}
		while(j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
		return c;
	}
	
	public static void waveArray(int arr[]) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i += 2) {
			// swap
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		
		waveArray(arr);
	}

}
