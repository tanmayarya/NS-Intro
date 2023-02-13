package Strings;


public class Strings1 {
	
	public static int getValue(char c) {
		switch (c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default: return 0;
		}
	}
	
	public static int romanToInteger(String romanNumber) {
		
		int result = getValue(romanNumber.charAt(romanNumber.length() - 1));
		
		for(int i = romanNumber.length() - 2; i >= 0; i--) {
			int curVal = getValue(romanNumber.charAt(i));
			int nextVal = getValue(romanNumber.charAt(i+1));
			if(curVal < nextVal) {
				result -= curVal;
			}else result+= curVal;
		}
		
		return result;
	}
	
	public static boolean canFormGivenStringByABString(String t) {
		if(t.charAt(0) == 'B' || t.charAt(t.length() - 1) == 'A') {
			return false;
		}
		int countA = 0, countB = 0;
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == 'A')
				countA++;
			else countB++;
			
			if(countB > countA) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int result = romanToInteger("IV");
		System.out.println(result);

	}

}
