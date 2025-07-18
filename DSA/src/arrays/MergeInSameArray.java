package arrays;

import java.util.Arrays;

public class MergeInSameArray {
	
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50,15,25,35,45,55};
		
		System.out.println(Arrays.toString(mergeInSameArray(ar)));
	}

	public static int[] mergeInSameArray(int []a) {

		
		int [] ans = new int [a.length];
		int i = 0,j=a.length/2,k=0;
		
		while (i<a.length/2 && j < a.length) {
			
			if (a[i]<=a[j]) {
				
				ans[k++]=a[i++];
			}else if (a[i]>a[j]) {
				ans[k++]=a[j++];
			}
		}
		while (i<a.length/2) {
			ans[k++]=a[i++];
		}
		while (j<a.length) {
			ans[k++]=a[j++];
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	
	}
}
