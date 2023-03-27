package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HM1 {
	
	public static int numberOfChars(String s) {
		boolean arr[] = new boolean[26];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a'] = true; 
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) count++;
		}
		return count;
	}
	
	public static int numberOfChars2(String s) {
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		return set.size();
	}
	
	public static long countEqualZeroOne(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) arr[i] = -1;
		}
		
		long count = 0;
		int sum = 0; 
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(map.containsKey(sum)) {
				int currentFreqOfSum = map.get(sum);
				count += currentFreqOfSum; 
				map.put(sum, currentFreqOfSum + 1);
				
			}else map.put(sum, 1);
		}
		
		return count;
	}

	public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countEqualZeroOne(arr));
    }

}
