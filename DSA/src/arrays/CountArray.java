package arrays;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,10,20,30,10,20,40,50,60};
		System.out.println(Arrays.toString(countArray(ar)));
	}
	public static int[] countArray(int[]ar) {
		 
		int [] count = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {

			int ct = 0;
			if (count[i] != -1) {
				for (int j = i+1; j < ar.length; j++) {
					
					if (ar[i]==ar[j]) {
						count[j] = -1;
						ct++;
					}
					count[i] = ct;
				}
			}
			
		}
		return count;
	}
}
