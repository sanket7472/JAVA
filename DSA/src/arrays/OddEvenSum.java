package arrays;

public class OddEvenSum {

	public static boolean oddEvenSum(int[]arr) {
		int oddSum=0 , evenSum=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
			
			}
		System.out.println("Sum of all the odd elements from array :"+ oddSum);
		System.out.println("Sum of all the Even elements from array :"+ evenSum);
	
		return oddSum == evenSum;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,21,20,3,10,15,1};
		if (oddEvenSum(arr)) {
			
			System.out.println("Even Sum and Odd Sum is same");
		}
	}
	

}
