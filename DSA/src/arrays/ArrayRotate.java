package arrays;

import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,50,60};
		
		//leftRotate(ar, 2);//30,40,50,60,10,20
		rightRotate(ar, 2);//50,60,10,20,30,40
	}
	public static void leftRotate(int[]ar , int times) {
		
		for (int i = 0; i < times; i++) {
			
			int temp = ar[0];
			
			for (int j = 1; j < ar.length; j++) {
				
				ar[j-1] = ar[j]; 
			}
			ar[ar.length-1] = temp;
		}
		System.out.println(" Left Rotated Array : "+ Arrays.toString(ar));
	}
	
	public static void rightRotate(int[]ar, int times) {
		
		for (int i = 0; i < times; i++) {
			
			int temp = ar[ar.length-1];
			
			for (int j = ar.length-2; j >= 0; j--) {
				
				ar[j+1] = ar[j]; 
			}
			ar[0] = temp;
		}
		System.out.println(" Right Rotated Array : "+ Arrays.toString(ar));
	}
	
}
