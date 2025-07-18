package arrays;

import java.util.Arrays;

public class MergeTwoArrayINSorted {

	public static void main(String[] args) {
		int[] ar1 = {10,20,30,40,50,60};
		int[] ar2 = {15,25,35,45,55,65};
		
		System.out.println(Arrays.toString(merge(ar1, ar2)));
	}
	public static int[] merge(int[]a, int[]b) {
		
		int [] ans = new int [a.length+b.length];
		int i = 0,j=0,k=0;
		
		while (i<a.length && j < b.length) {
			
			if (a[i]<=b[j]) {
				
				ans[k++]=a[i++];
			}else if (a[i]>b[j]) {
				ans[k++]=b[j++];
			}
		}
		while (i<a.length) {
			ans[k++]=a[i++];
		}
		while (j<b.length) {
			ans[k++]=b[j++];
		}
		return ans;
	}
}
