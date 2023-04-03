package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	
	public static void print1tonBinary(int n) {
		Queue<String> q = new LinkedList<>();
		q.add("1");
		
		for(int i = 1; i <= n; i++) {
			String curr = q.poll();
			System.out.println(curr);
			q.add(curr + '0');
			q.add(curr + '1');
		}
	}
	
	public static String removeKChar(String str, int k) {
		Deque<Character> q = new LinkedList<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			while(!q.isEmpty() && q.peekLast() < ch && k > 0) {
				q.pollLast();
				k--;
			}
			q.addLast(ch);
		}
		
		while(k-- > 0) {
			q.pollLast();
		}
		String res = "";
		while(!q.isEmpty()) {
			res += q.pollFirst();
		}
		return res;
	}

	public static void main(String[] args) {
		print1tonBinary(16);
		System.out.println(removeKChar("abdecfknaba", 4));

	}

}
