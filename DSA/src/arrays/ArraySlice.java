package arrays;

import java.util.Arrays;

public class ArraySlice {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80};
		arraySlice(arr, 3, 6);
	}
	public static void arraySlice(int[]ar, int start , int end) {
		
		System.err.println("Original Array : ");
		System.out.println(Arrays.toString(ar));
		System.out.println();
		if (start>=0 && end< ar.length) {
			
			int cnt = 0,i;
			for ( i= start; i <=end; i++) {
				cnt ++;
			}
			i =0;
			int sliceStart= start;
			int [] slice = new int [cnt];
			while(i<cnt) {
				slice[i] = ar[sliceStart++];
				i++;
			}
			System.err.println(" Slice of Array : ");
			System.out.println(Arrays.toString(slice));
			
			int [] newArr = new int [ar.length-slice.length];
			
			for (int j = 0; j < ar.length ; j++) {
				
				if (j< start) {
					 newArr[j] = ar[j];
				} else if (j>end) {
					newArr[j-slice.length] = ar[j];
				} 
			}
			System.err.println(" Remaining part of Array : ");
			System.out.println(Arrays.toString(newArr));
			}
		}
	}


