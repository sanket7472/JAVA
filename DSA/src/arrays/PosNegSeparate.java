package arrays;

import java.util.Arrays;

public class PosNegSeparate {

	public static void main(String[] args) {
		
		int [] ar = {-10,-50,-60,-10,-20};
		separatePosNeg(ar);
	}
	public static void separatePosNeg(int [] arr) {
		
		int i = 0, j = arr.length-1;
		
		while(i<j) {
			while(arr[i] >= 0 && i<arr.length) {
				i++;
			}
			while(arr[j] < 0 && j>i) {
				j--;
			}
			if (i<j) {
				
				arr[i] = arr[i]+arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
