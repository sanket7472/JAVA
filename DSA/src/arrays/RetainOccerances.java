package arrays;

import java.util.Arrays;

public class RetainOccerances {

	public static void main(String[] args) {
		
		int[] arr = {10,20};
		System.out.println(Arrays.toString(retainOcc(arr)));
	}
	
	public static int[] retainOcc(int[]arr) {
		
		int count[] = retainCnt(arr);
		int ct = 0;
		for (int i = 0; i < count.length; i++) {
			
			if (count[i] != 0) {
				ct++;
			}
		}
		if (ct>0) {
			
			int [] ans = new int[ct];
			for (int i = 0,j=0; i < arr.length; i++) {
				
				if (count[i] != 0) {
					
					ans[j] = arr[i];
					j++;
				}
			}
			return ans;
		}
		return null;
	}
	public static int[] retainCnt(int[] ar) {
		int [] count = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			
			int cnt = 0;
			
			
			if (count[i] !=-1) {
				for (int j = i+1; j < ar.length; j++) {
						if (ar[i]==ar[j]) {
							cnt++;
							count[j] = -1;
						}
					
				}
				count[i] = cnt;
			}
		}
			return count;
	}
}
