package arrays;

import java.util.Arrays;

public class AddEleAtIndex {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		System.out.println(Arrays.toString(addEleIndex(arr, 5, 100)));
	}
	public static int[] addEleIndex(int[]ar, int idx, int ele) {
		
		if (idx>=0 && idx <= ar.length) {
			
			int [] ans = new int [ar.length+1];
			
			for (int i = 0; i < ans.length; i++) {
				
				if (i<idx) {
					
					ans[i] = ar[i];
				}else if (i == idx) {
					ans[i] = ele;
				}
				else if (i>idx) {
					ans[i] = ar[i-1];
				}
			}
			return ans;
		}
		System.out.println("Element can't added to invalid index..!");
		return ar;
	}
}
