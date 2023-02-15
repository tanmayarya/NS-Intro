package Recursion;

public class Basics {

	public static void printDecreasing(int n) {
		if(n == 0) return;
		System.out.println(n);
		printDecreasing(n - 1);
	}
	
	public static void printIncreasing(int n) {
		if(n == 0) return;
		printIncreasing(n - 1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {

//		printDecreasing(6);
		printIncreasing(10);
	}

}
