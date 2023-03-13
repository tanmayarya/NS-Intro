package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class Maths2 {
	
	public static boolean[] getSeive(int n) {
		boolean seive[] = new boolean[n + 1];
		Arrays.fill(seive, true);
		for(int i = 2; i * i <= n; i++) {
			if(seive[i]) {
				for(int j = 2 * i; j <= n; j += i) {
					seive[j] = false;
				}
			}
		}
		return seive;
	}
	
	public static void twoPrimeNumbers(int n, boolean seive[]) {
		for(int i = 2; i <= n; i++) {
			if(seive[i] && seive[n-i]) {
				System.out.println(i + " " + (n-i));
				return;
			}
		}
	}
	
	public static void maxPrimeNumber(int L, int R, boolean seive[]) {
		for(int i = R; i >= L; i--) {
			if(seive[i]) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	
	
	public static int[] countPrimeSeive(int n) {
		int seive[] = new int[n + 1];
		Arrays.fill(seive, 1);
		for(int i = 2; i * i <= n; i++) {
			if(seive[i] == 1) {
				for(int j = 2 * i; j <= n; j += i) {
					seive[j] = 0;
				}
			}
		}
        seive[0] = 0; // we have 0 primes till 0
        seive[1] = 0; // we have 0 primes till 1
		int countPrime = 0;
		for(int i = 2; i < seive.length; i++) {
			countPrime += seive[i];
			seive[i] = countPrime;
		}
		
		return seive;
	}

	public static void main(String[] args) {
//		boolean seive[] = getSeive(100000);
		Scanner scn = new Scanner(System.in);
//		int L = scn.nextInt();
//		int R = scn.nextInt();
//		maxPrimeNumber(L, R, seive);
		int t = scn.nextInt();
		int seive[] = countPrimeSeive(100000);
		while(t-- > 0) {
			int n = scn.nextInt();
			System.out.println(seive[n]);
//			twoPrimeNumbers(n, seive);
			
		}
	}

}
