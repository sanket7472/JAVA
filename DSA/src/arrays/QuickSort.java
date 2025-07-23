package arrays;


public class QuickSort {

	public static void main(String[] args) {
		
		int [] ar  = {50,20,60,10};
		
		quickSort(ar, 0, ar.length-1);
		
	}
	public static void quickSort(int[]ar,int start,int end) {
		if (start<end) {
			int pos = partition(ar,start,end);
			quickSort(ar, start, pos+1);
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
			while (j>=start && ar[j]>=ref) {
				j--;
			}
			if (i<j) {
				
				swap(ar,i,j);
			}
		}
		swap(ar,start,j);
		return j;
	}
	public static void swap(int[] ar, int i, int j) {
		
		int temp = ar[i];
		ar[i]=ar[j];
		ar[j]= temp;
	}
}
