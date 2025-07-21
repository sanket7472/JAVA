package arrays;

import java.util.Arrays;

public class ReverseArray {

	// logic 1 using second variable
	public static int[] revArray1(int [] arr) {
		
		int [] rev = new int [arr.length];
		
		for (int i = arr.length-1 , j = 0; i>=0 || j<arr.length; i-- , j++) {
			
			rev[j] = arr[i];
		}
		return rev;
	}
	
	// logic 2 without second variable
	//always prefered 
	public static int [] revArray2(int[]arr) {
		int rev [] = new int [arr.length];
		
		for (int i = 0; i < rev.length; i++) {
			
			rev[arr.length-1-i] = arr[i];
		}
		
		return rev;
	}
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		int rev [] = revArray1(arr);
		int rev2 [] = revArray2(arr);
		
		System.out.println(Arrays.toString(rev));
		System.out.println(Arrays.toString(rev2));
	}
}
