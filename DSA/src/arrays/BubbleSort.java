package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []ar= {50,60,40,20,10};
		System.out.println(Arrays.toString(bubbleSort(ar)));
	}
	public static int[] bubbleSort(int[] ar) {
		
		for (int i = 0; i < ar.length-1; i++) {
			/*
			 * in all iterations i iterations of inner loop get wasted 
			 * thats why we reduce iterations of inner loop i times each times
			 * */
			for (int j = 0; j < ar.length-1-i; j++) {
				
				if (ar[j]>ar[j+1]) {
					
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		return ar;
	}
}
