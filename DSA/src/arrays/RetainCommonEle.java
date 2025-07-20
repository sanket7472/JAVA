package arrays;

import java.util.Arrays;

public class RetainCommonEle {

	public static void main(String[] args) {
		
		int[]ar1 = {10,20,30,40,50,60,10,20,50,80};
		int[]ar2 = {10,50,40,80,90,70,10};
		
		System.out.println(Arrays.toString(retainCommon(RemoveDuplicates.removeDuplicate(ar1),RemoveDuplicates.removeDuplicate( ar2)) ));
	}
	public static int[] retainCommon(int[]ar1,int[]ar2) {
		
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
			
			int [] ans = new int[ct];
			for (int i = 0,j=0; i < ar1.length; i++) {
				
				if (occ[i] == true) {
					
					ans[j] = ar1[i];
					j++;
				}
			}
			return ans;
		}
		return null;
	
		
	}
}
