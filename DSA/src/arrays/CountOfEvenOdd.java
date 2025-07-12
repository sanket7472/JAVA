package arrays;

public class CountOfEvenOdd {

	public static void count(int[]arr) {
		
		int oddCnt = 0 , evenCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0) {
				evenCnt++;
			}
			else
				oddCnt++;
		}
		
		System.out.println("Count of Odd numbers : "+oddCnt);
		System.out.println("Count of Even numbers : "+evenCnt);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,11,12,15,15,17,15,13,12,14,18,18};
		
		count(arr);
	}
}
