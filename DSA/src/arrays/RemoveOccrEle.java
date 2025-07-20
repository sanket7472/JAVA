package arrays;

import java.util.Arrays;

public class RemoveOccrEle {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,50,40,10,20,10,10,10,50};
		System.out.println(Arrays.toString(removeOcceranceOf(arr, 10)));
	}
	public static int[] removeOcceranceOf(int[]ar, int ele) {
		
		int ct = 0;
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] == ele) {
				ct++;
			}
		}
		
		if (ct>0) {
			
			int [] ans = new int[ar.length-ct];
			for (int i = 0,j=0; i < ar.length; i++) {
				if (ar[i]!=ele) {
					ans[j]=ar[i];
					j++;
				}
			}
			return ans;
		}
		return ar;
	}
}
