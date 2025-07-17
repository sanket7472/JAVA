package arrays;

public class PalindromArray {

	//using for loop
	public static boolean isPalindrom1(int[]arr) {
		int i ,j;
		for ( i = 0, j=arr.length-1; i < arr.length; i++,j--) {
			
			if (arr[i] != arr[j]) {
				break;
			}
		}
		return i>=j;
	}
	
	// using while loop
	
	public static boolean isPalindrom2(int []arr) {
		
		int i=0 ,j=arr.length-1;
		while (i<j) {
			
			if (arr[i] != arr[j]) {
				break;
			}
			else {
				i++;
				j--;
			}
		}
		return i>=j;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,2,1};
		
		System.out.println(isPalindrom2(arr));
	}
}
