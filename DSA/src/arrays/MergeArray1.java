package arrays;

import java.util.Arrays;

public class MergeArray1 {
	// simple merge 

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50,60};
		int [] ar2 = {70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArray(ar1, ar2)));
	}
	
	public static int[] mergeArray(int[]arr1, int[]arr2) {
		int [] ans  = new int [arr1.length + arr2.length];
		
		for (int i = 0; i < ans.length; i++) {
			
			if (i<arr1.length) {
				
				ans[i] = arr1[i];
			}else {
				ans[i] = arr2[i-arr1.length];
			}
		}
		return ans;
	}
}
