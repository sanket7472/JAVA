package arrays;

public class FindMissingEle {

	//this logic used when the single elememt is missing from array
	// use only when elements shows thw series start from 1
	// and when have the gap/ increment of 1 ;
	public static int missingElement(int[]arr) {
		int sum = 0 ;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
			if (arr[i]>max) {
				
				max = arr[i];
			}
			
		}
		return ((max*(max+1))/2)-sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,6};
		System.out.println(" Missing element from array : "+missingElement(arr));;
	}
}
