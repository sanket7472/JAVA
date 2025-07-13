package arrays;
public class CountOfPrime {

	public static int countOfPrime(int[]arr) {
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			
			int den=2;
			while (den <=arr[i]) {
				
				if (den == arr[i]) {
					cnt++;
				}
				else if (arr[i] % den==0) {
					
					break;
				}
				den++;
				
			}
			}
		return cnt;
		}
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int cnt = countOfPrime(arr);
		
		System.out.println("Count of Prime numbers in the array : "+cnt);
	}
}
