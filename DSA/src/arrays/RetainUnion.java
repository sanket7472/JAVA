package arrays;

import java.util.Arrays;

public class RetainUnion {
	
	public static void main(String[] args) {
		int [] ar1 = {10,20,40,50,60,20,30};
		int []ar2 = {10,50,60,40,20,30,80};
		
		System.out.println(Arrays.toString(union(ar1, ar2)));
	}
	public static int[] union(int[]ar1 , int[] ar2) {
		
		int [] ar = MergeArray1.mergeArray(ar1, ar2);
		return RemoveDuplicates.removeDuplicate(ar);
	}
}
