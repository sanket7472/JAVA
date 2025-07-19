package arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(removeEle(arr, 10)));
	}
	public static int [] removeEle(int [] ar, int ele) {
		int i = 0;
		for (; i < ar.length; i++) {
			
			if (ar[i] == ele) {
				
				break;
			}
		}
		if (i<ar.length) {
			
			int[] ans = new int[ar.length-1];
			for (int j = 0; j < ar.length; j++) {
				
				if (j<i) {
					ans[j] = ar[j];
				}
				else if (j>i) {
					ans[j-1] = ar[j];
				}
			}
			return ans;
		} 
		else {
			System.out.println(i+" Element not found ..!");
		}
		return ar;
	}
}
