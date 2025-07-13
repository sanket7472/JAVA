package arrays;

import java.util.Arrays;

public class AddArrayInArray {

	public static void main(String[] args) {
		
		int ar1[] = {10,20};
		int [] ar2 = {32};
		System.out.println(Arrays.toString(addArrayToIdx(ar1, ar2, 1)));
	}
	public static int[] addArrayToIdx(int[]ar1,int[]ar2,int idx) {
		
		if (idx>=0 && idx < ar1.length) {
			
			int [] ans = new int [ar1.length + ar2.length];
			
			for (int i = 0; i < ans.length; i++) {
				
				if (i<idx) {
					ans[i] = ar1[i];
				}
				else if (i == idx) {
					for (int j = 0; j < ar2.length; j++) {
						
						ans[i] = ar2[j];
						i++;
					}
				}else 
				{
					ans[i] = ar1[i-ar2.length];
				}
			}
			
			return ans;
		}
		System.out.println("Index out of bound...!");
		return ar1;
		
	}
}
