package Recursion;

public class Recursion2 {
	
	public static int multiply(int m, int n) {
		if(n == 0) return 0;
		int ans = multiply(m, n - 1);
		return ans + m;
	}
	
	
	public static boolean isPalindrome(String str, int si, int ei) {
		if(si >= ei) return true;
		
		// if starting char is not equal to ending char 
		if(str.charAt(si) != str.charAt(ei)) return false;  
	
		return isPalindrome(str, si + 1, ei - 1);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("abccba", 0, 5));
	}

}
