package arrays;

import java.util.Arrays;
public class MergeSort {
	
	public static void main(String[] args) {
		
		int []a = {12,1,5,17,8,10,3};
		
		System.out.println(Arrays.toString(mergeSort(a, 0, a.length-1)));
	}

	public static int[] mergeSort(int[]a,int start,int end) {
		
		if(start<end) {
			
			int mid = (start+end)/2;
			
			mergeSort(a, start, mid);
			//System.out.println(Arrays.toString(a));
			mergeSort(a, mid+1, end);
			//System.out.println(Arrays.toString(a));
			mergeInSameArray(a, start, mid, end);
			//System.out.println(Arrays.toString(a));
			
		}
		return a;
	}
	public static int[] mergeInSameArray(int []a , int start, int mid, int end) {

		
		int [] ans = new int [a.length];
		int i = start,j=mid+1,k=start;
		
		while (i<=mid && j <= end) {
			
			if (a[i]<=a[j]) {
				
				ans[k++]=a[i++];
			}else if (a[i]>a[j]) {
				ans[k++]=a[j++];
			}
		}
		while (i<=mid) {
			ans[k++]=a[i++];
		}
		while (j<=end) {
			ans[k++]=a[j++];
		}
//		System.out.println(Arrays.toString(ans));
		for (int k2 = start; k2 <= end; k2++) {
			
			a[k2]=ans[k2];
		}
	return a;
	}
}
