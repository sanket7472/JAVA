package arrays;

import java.util.Arrays;

public class MergeArray4 {
	
	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50,60};
		int [] ar2 = {70,80,90,100};
		
		System.out.println(Arrays.toString(mergeArray(ar1, ar2)));
	}
	
	public static int[] mergeArray(int[]arr1, int[]arr2) {
		int [] ans  = new int [arr1.length + arr2.length];
		
		for (int i = 0 , j = arr1.length-1 , k = arr2.length-1; i < ans.length; i++) {
			
			if (i<arr1.length) {
				
				ans[i] = arr1[j];
				j--;
			}else {
				ans[i] = arr2[k];
				
			}
		}
		return ans;
	}
}
