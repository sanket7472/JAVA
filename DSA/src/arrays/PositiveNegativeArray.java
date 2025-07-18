package arrays;

import java.util.Arrays;

public class PositiveNegativeArray {

	public static int[] makePositive(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<0) {
				
				arr[i] = -(arr[i]);
			}
		}
		return arr;
	}
	
	public static int[] makeNegative(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = arr[i] < 0 ? arr[i] : -(arr[i]);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,-30,-40,50,-60};
		
		//System.out.println(Arrays.toString(makePositive(arr)));
		System.out.println(Arrays.toString(makeNegative(arr)));
	}
}
