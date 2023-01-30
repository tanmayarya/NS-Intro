package ArrayLists;

import java.util.*;

public class Questions {
	
	public static void countFreq(ArrayList<Integer> list) {
		// sort the array list
		Collections.sort(list);
		
		int count = 1;
		
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) == list.get(i - 1)) {
				count++;
			} else {
				System.out.println(list.get(i - 1) + " " + count);
				count = 1;
			}
		}
		System.out.println(list.get(list.size() - 1) + " " + count);
	}

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0; i < n; i++) {
			l.add(scn.nextInt());
		}
		countFreq(l);
	}

}
