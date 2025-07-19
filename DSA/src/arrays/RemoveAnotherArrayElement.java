package arrays;

import java.util.Arrays;

public class RemoveAnotherArrayElement {

	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50,10,20,30,40,50};
		int[] ar2 = {20,40,60,80};
		
		System.out.println(Arrays.toString(RemoveDuplicates.removeDuplicate(removeDuplicate(ar1, ar2))));
	}
	public static int[] removeDuplicate(int[] ar1,int[]ar2) {
		
		boolean [] occ = new boolean[ar1.length];
		int ct=0;
		for (int i = 0; i < ar2.length; i++) {

				for (int j = 0; j < ar1.length; j++) {
					
					if(ar1[j] == ar2[i]) {
						occ[j] = true;
						ct++;
					}
				}
			}
		if (ct>0) {
			
			int [] ans = new int[ar1.length-ct];
			for (int i = 0,j=0; i < ar1.length; i++) {
				
				if (occ[i] != true) {
					
					ans[j] = ar1[i];
					j++;
				}
			}
			return ans;
		}
		return null;
	}
}
