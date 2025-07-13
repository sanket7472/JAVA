package arrays;

import java.util.Arrays;

public class DuplicateArray {

	// using the dup array variable
	public static int[] dupArray(int[]arr) {
		
		int dup[] = new int[arr.length];
		for (int i = 0; i < dup.length; i++) {
			
			dup[i] = arr[i];
		}
		return dup;
	}
	// without using dup array but using third variable
	public static int[] dupArray2(int []arr) {
		
		for (int i = 0,j = arr.length-1; i <= j; i++ , j--) {
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
		return arr;
	}
	// without using dup array and the third variable
	public static int[] dupArray3(int[]arr) {
		
		for (int i = 0, j = arr.length-1; i <=j; i++ , j--) {
			
				arr[i] = arr[i]+arr[j];
				arr[j] = arr[i]-arr[j];
				arr[i] = arr[i]-arr[j];
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		
		int dup[] = dupArray3(arr);
		// first way to print array element
		System.out.println(Arrays.toString(dup));
		
		// second way 
//		
//		for (int i = 0; i < dup.length; i++) {
//			System.out.print(dup[i]+" ");
//		}
	}
}
