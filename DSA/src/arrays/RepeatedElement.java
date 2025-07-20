package arrays;

public class RepeatedElement {


	public static int countOfRepeatElement(int[]arr, int num) {
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==num) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,12,1,2,5,4,1,6,2,3,1,4,5,1};
		int num = 1;
		int cnt = countOfRepeatElement(arr, num);
		
		System.out.println("Count of "+num+" int the array : "+cnt);
	}
}
