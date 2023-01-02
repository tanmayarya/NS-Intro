package Basics;

public class ArraysIntro {

	public static void main(String[] args) {
		
//		System.out.println(22222);
//		System.out.println("Hello, How are you");
		
		
		int marks[] = new int[5];
		marks[2] = 30;
		marks[1] = 90;
		marks[0] = 40;
		marks[4] = 40;
		marks[3] = 10;
		
//		System.out.println(marks[2]);
//		
//		System.out.println(marks.length);

//		boolean arr[] = new boolean[2];
		
//		char sections[] = new char[5];
//		sections[4] = 'A';
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
		
		for(int idx = 0; idx < marks.length; idx = idx + 1) {
			System.out.println(marks[idx]);
		}
//		
//		for(int idx = marks.length - 1; idx >= 0; idx = idx - 1) {
//			System.out.println(marks[idx]);
//		}
		
		int sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println(sum);
		
		
		System.out.println("***************");
		
//		int max = marks[0];
//		for(int i = 1; i < marks.length; i++) {
//			if(marks[i] > max) {
//				max = marks[i];
//			}
//		}
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(max);
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > max) {
				smax = max;
				max = marks[i];
			} else if(marks[i] > smax) {
				smax = marks[i];
			}
		}
		
		System.out.println(smax);
		
		
	}
	

}
