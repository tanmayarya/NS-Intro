package SearchingAndSorting;

import java.util.*;

public class CountZeroToOnes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		int rows[] = new int[n + 1];
		int cols[] = new int[n + 1];
		int rowsChanged = 0, colsChanged = 0;
		long zerosLeft = n * n;
		while(q-- > 0) {
			int i = scn.nextInt();
			int j = scn.nextInt();
			if(rows[i] == 0) {
				rows[i] = 1;
				int zerosLeftInThisRow = n - colsChanged;
				zerosLeft -= zerosLeftInThisRow;
				rowsChanged++;
			}
			if(cols[j] == 0) {
				cols[j] = 1;
				int zerosLeftInThisCol = n - rowsChanged;
				zerosLeft -= zerosLeftInThisCol;
				colsChanged++;
			}
			System.out.print(zerosLeft + " ");
		}
		
		
		
		
		
	}

}
