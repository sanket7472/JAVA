package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] ar = {10,20,20,10,40,40,50,40,50,40,50};
		System.out.println(Arrays.toString(removeDuplicate(ar)));
	}
	public static int[] countArray(int[]ar) {
		 
		int [] count = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {

			if (count[i] != -1) {
				for (int j = i+1; j < ar.length; j++) {
					
					if (ar[i]==ar[j]) {
						count[j] = -1;
					}
				}
			}
		}
		return count;
	}
	
	public static int[] removeDuplicate(int[]ar) {
		
		int [] count = countArray(ar);
		
		int negCnt = 0;
		for (int i = 0; i < ar.length; i++) {
			
			if (count[i]==-1) {
				negCnt++;
			}
		}
		if (negCnt>0) {
			
			int [] ans = new int [ar.length-negCnt];
			
			for (int i = 0,j=0; i < ar.length; i++) {
				
				if (count[i] != -1) {
					
					ans[j] = ar[i];
					j++;
				}
			}
			return ans;
		}
		return ar;
	}
}
