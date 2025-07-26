package arrays;

import java.util.Arrays;

public class SeparatePositiveNegative {

	public static int[] separate(int[]ar) {
		int [] ans = new int[ar.length];
		int mem=0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>=0) {
				ans[mem] = ar[i];
				mem++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]<0) {
				ans[mem] = ar[i];
				mem++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		int [] ar = {10,-20,-30,22,-15,4,-50};
		
		System.out.println(Arrays.toString(separate(ar)));
	}
}
