package arrays;

import java.util.Arrays;

public class RetainRange {

	public static void main(String[] args) {
		int[] ar = {10,20,30,10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(retainRange(ar, 2, 8)));
	}
	public static int[] retainRange(int[]ar,int start,int end) {

		if (start>=0 && start<=end && end<ar.length) {
			
			int[] ans = new int[end-start];
			for (int i = 0; i <ans.length;i++) {

					ans[i]=ar[start++];

			}
			return ans;
		}
		return null;
	}
}
