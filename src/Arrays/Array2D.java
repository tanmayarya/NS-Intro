package Arrays;

import java.util.*;

public class Array2D {
	
	
	public static void approch2() {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0) { 
			int row = scn.nextInt();
			int col = scn.nextInt();
			scn.nextLine();
			String s0 = "";
			String s1 = "";
			while(col-- > 0) {
				s0 += "0 "; // 0 0 0 0 0 0
				s1 += "1 "; // 1 1 1 1 1 1
			}
			
			String arr[] = new String[row];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextLine();
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].contains("1")) {
					System.out.println(s1);
				}
				else System.out.println(s0);
			}
		} 
	}

	public static void convertRowTo1(int a[][], int row) {
		for(int i = 0; i <a[row].length; i++) {
			a[row][i] = 1;
		}
	}
	
	public static void display(int a[][]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int t = scn.nextInt();
//		while(t-- > 0) {
//			int row = scn.nextInt();
//			int col = scn.nextInt();
//			int a[][] = new int[row][col];
//			// take input
//			for(int i = 0; i < row; i++) {
//				for(int j = 0; j < col; j++) {
//					a[i][j] = scn.nextInt();
//				}
//			}
//			
//			for(int i = 0; i < row; i++) {
//				for(int j = 0; j < col; j++) {
//					if(a[i][j] == 1) {
//						convertRowTo1(a, i);
//						continue;
//					}
//					
//				}
//			}
//			display(a);
//		}
//		approch2();
//		System.out.println("\"Newton School\"");
		
		
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int board[][] = new int[n][n];
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
////				board[i][j] = scn.nextInt();
//				if((i + j)%2 == 0 && board[i][j] == 0) count++;
//				else if((i + j)%2 == 1 && board[i][j] == 1) count++;
//			}
//		}
//		System.out.println(Math.min((n*n) - count, count));
		
		
		String s = "1 2 44 5 9 0 ";
		String arr[] = s.split("44");
		for(int i =0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		
		
	}
}
