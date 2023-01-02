package Basics;

public class Session2 {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
/*
 
 multi line of comment
 	
 */
// single line comment
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(b == a);
		System.out.println(a);
		System.out.println(b);
		int c = 20;
		
		System.out.println(b == c);
		
		
		boolean aIsEqualsToB = a == b;
		System.out.println(aIsEqualsToB);
		
		
		System.out.println("-------------------");
		
		// if and else
		
//		System.out.println("before if");
//		if(b > c) {
//			System.out.println("inside if block");
//			
//		} 
//		else {
//			System.out.println("inside else block");
//		}
		
//		byte  var = 128;
		
		int age = 1000000000;
		
//		if(age >= 18) {
//			System.out.println("adult");
//		}
//		else {
//			System.out.println("young");
//		}
		
		if(age < 18) {
			System.out.println("young");
		} else if(age > 60) {
			System.out.println("old");
		} else {
			System.out.println("adult");
		}
		
		int day = 2;
		/* day = 1 -> monday
		 * day = 2 -> tuesday
		 * 
		 * 
		 * day = 7 -> sunday
		 *
		 */
		
		
//	nesting if else
//		
//		if(age == 1) {
//			// nesting
//			
//			if(age == 2) {
//				
//				if(age == 3) {
//					
//				} else {
//					
//				}
//			} else{
//				
//			}
//		}
		
		if(age > 18) {
			
			if(age > 60) {
				System.out.println("old");
			} else {
				System.out.println("adult");
			}
		} else {
			System.out.println("young");
		}
		

	}

}
