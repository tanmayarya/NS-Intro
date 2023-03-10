package Maths;

public class Maths1 {
	
	public static int gcd(int a, int b) {
		if(a % b == 0) return b;
		
		return gcd(b, a % b);
	}
	
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static int evenlyDivisibleNumber(int n) {
		int lcm = 1;
		for(int i = 2; i <= n; i++) {
			lcm = lcm(lcm, i);
		}
		return lcm;
	}
}
