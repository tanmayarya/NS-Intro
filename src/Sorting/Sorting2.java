package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting2 {

	public static int minimizeProduct(int num1[], int num2[]) {
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		int sum = 0;
		for(int i = 0; i < num1.length; i++) {
			sum += num1[i] * num2[num1.length - 1 - i];
		}
		return sum;
	}
	

	public static void seperatePositiveNegative(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0)System.out.print(arr[i] + " ");
		}
	}
	
	public static long mergeSortInversion(int arr[], int l, int h) {
		if(l >= h) return 0;
		
		int m = (l + h) / 2;
		long count = 0;
		count += mergeSortInversion(arr, l , m);
		count += mergeSortInversion(arr, m + 1 , h);
		count += mergeInversion(arr, l, m, h);
		return count;
	}
	
	public static long mergeInversion(int arr[], int l, int m, int h) {
		int temp[] = new int[h - l + 1];
		int i = l, j = m + 1, k = 0;
		long inversion = 0;
		while(i <= m && j <= h) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
				inversion += m - i + 1;
			}
		}
		while(i <= m) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j <= h) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for(k = 0, i = l; k < temp.length; i++, k++) {
			arr[i] = temp[k];
		}
		
		return inversion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 10, 5, 7};
		int b[] = {9, 1, 7, 4};
		System.out.println(minimizeProduct(a, b));

	}

}
