package arrays;

import java.util.Arrays;

public class HalfArrayReverse {

	public static int[] dupArray(int []arr) {
		
		for (int i = arr.length/2,j = arr.length-1; i <= j; i++ , j--) {
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
		return arr;
	}
public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60};
		int rev2 [] = dupArray(arr);
		
		System.out.println(Arrays.toString(rev2));
	}
}
