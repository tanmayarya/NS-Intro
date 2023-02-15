package Recursion;

public class Intro {
	
	public static void fun(int n) {
		fun2(n);
		System.out.println(n);
	}
	
	public static void fun2(int n) {
		n = 40;
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		int a = 10;
		fun(a);
		int b = 20;
	}
}
