package arrays;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int [] ar  = {10,9,8,7,6,5,4,3,2,1};
		
		quickSort(ar, 0, ar.length-1);
		//System.out.println(Arrays.toString(ar));
	}
	public static void quickSort(int[]ar,int start,int end) {
		if (start<end) {
			int pos = partition(ar,start,end);
			quickSort(ar, start, pos-1);
			quickSort(ar, pos+1,end);
			
		}
		
		
	}
	public static int partition(int[] ar, int start, int end) {
		int ref = ar[start];
		int i = start, j = end;
		
		while (i<j) {
			
			while (i<=end && ar[i]<=ref) {
				i++;
			}
			while (j>start && ar[j]>=ref) {
				j--;
			}
			if (i<j) {
				swap(ar,i,j);
			}
		}
		if (j!=start) {
			swap(ar,start,j);
			//System.out.println(Arrays.toString(ar));
		}
//		System.out.println("swap");
//		swap(ar,start,j);
		return j;
	}
	public static void swap(int[] ar, int i, int j) {
		
		int temp = ar[i];
		ar[i]=ar[j];
		ar[j]= temp;
	}
}
