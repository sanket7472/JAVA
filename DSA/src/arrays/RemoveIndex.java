package arrays;

import java.util.Arrays;

public class RemoveIndex {

	public static void main(String[] args) {
		
		int [] ar = {10,20,30,50,60,40,10};
		System.out.println(Arrays.toString(removeIdx(ar, 0)));
	}
	public static int[] removeIdx(int[]ar , int idx) {
		
		if (idx>=0 && idx<ar.length) {
			
			int [] ans = new int [ar.length-1];
			for (int i = 0; i < ar.length; i++) {
				
				if (i<idx) {
					
					ans[i] = ar[i];
				}
				else if (i>idx) {
					
					ans[i-1] = ar[i];
				}
			
			}
			return ans;
		}
		else {
			System.out.println("Index Out of Bound ...!");
		}
		return ar;
	}
}
