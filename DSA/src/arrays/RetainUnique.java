package arrays;

import java.util.Arrays;

public class RetainUnique {
	
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60,10,20};
		System.out.println(Arrays.toString(retainUnique(ar)));
	}
	public static int[] retainUnique(int[]ar) {
		
		int [] count = CountArray.countArray(ar);
		
		int ct = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i]==0) {
				ct++;
			}
		}
		if (ct>0) {
			int[] ans = new int[ct];
			for (int i = 0,j=0; i < ar.length; i++) {
				
				if (count[i]==0) {
					ans[j++] = ar[i];
				}
			}
			return ans;
		}
		return null;
	}
}
