package arrays;

import java.util.Arrays;

public class ZigZagMerge {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,50,60};
		int [] ar2 = {70,80,90,100,110,120};
		
		System.out.println(Arrays.toString(mergeArray1(ar1, ar2)));
	}
	
	// logic first
	public static int[] mergeArray(int[]arr1, int[]arr2) {
		int [] ans  = new int [arr1.length + arr2.length];
		
		for (int i = 0 , j = 0, k=0 ; i < ans.length; i++) {
			
			if (i%2==0 && j<arr1.length) {
				
				ans[i] = arr1[j];
				j++;
			}else if (k<arr2.length) {
				
				ans[i] = arr2[k];
				k++;
			}else if (j<arr1.length) {
				
				ans[i] = arr1[j];
			}
		}
		return ans;
	}
	// logic second
	public static int[] mergeArray1(int[]arr1, int[]arr2) {
		int [] ans  = new int [arr1.length + arr2.length];
		
		int mem = 0;
		for (int i = 0; mem < ans.length; i++) {
			
			if (i<arr1.length) {
				
				ans[mem] = arr1[i];
				mem++;
			}
			
			if (i<arr2.length) {
				ans[mem] = arr2[i];
				mem++;
			}
			
		}
		return ans;
	}
}
