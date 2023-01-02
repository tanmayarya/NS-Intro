package Basics;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int i = scn.nextInt();
		
//		turn the ith bit on
//		int mask = 1 << (i - 1);
//		int ans = a | mask;
//		System.out.println(ans);
		
		
		// turn ith bit off
		int mask = ~(1 << (i - 1));
		int ans = a & mask;
		System.out.println(ans);
		
	}

}
