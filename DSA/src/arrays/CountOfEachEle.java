package arrays;


public class CountOfEachEle {

	public static void count(int[] arr) {
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
				for (int k = 0; k < arr.length; k++) {
					
					if (arr[k]==arr[i]) {
						cnt++;
					}
			}
				boolean flag = true;
				for (int j = 0; j < i; j++) {
					if (arr[i]==arr[j]) {
						
						flag = false;
					}
				}
				if (flag) {
					System.out.println(arr[i]+" repeated in array "+cnt+" times");
				}
				
				cnt=0;
		}
		}
	
	public static void main(String[] args) {
		
		int [] arr = {1,1,1,2,1,1,1,100,100,1,2,1,1,100};
		
		count(arr);
	}
}
