package arrays;

import java.util.Arrays;

public class EvenOddDivide {

	public static int[] divideEvenOdd(int[] arr) {
		int [] ans = new int [arr.length];
		
		for (int i = 0,k = 0, j= ans.length-1; i < ans.length; i++) {
			
			if (k<=j) {
				if (arr[i] %2==0) {
					ans[k] = arr[i];
					k++;
				}
				else {
					ans[j] = arr[i];
					j--;
				}
			}
		}
		return ans;
	}

	public static int[] divideEvenOdd2(int[] arr) {
		int [] ans = new int [arr.length];
		int mem =0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0) {
				ans[mem] = arr[i];
				mem++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==1) {
				ans[mem] = arr[i];
				mem++;
			}
		}
		
	
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		int[] ar = {10,11,12,13,14,15};
		
		System.out.println(Arrays.toString(divideEvenOdd2(ar)));
	}
}
