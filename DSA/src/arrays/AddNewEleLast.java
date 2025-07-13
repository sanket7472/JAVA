package arrays;

import java.util.Arrays;

public class AddNewEleLast {

	public static void main(String[] args) throws InterruptedException {
		
		int [] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(addEleLast1(arr, 60)));
	}
	public static int[] addEleLast(int[]ar , int ele) {
		int [] ans = new int [ar.length+1];
		for (int i = 0; i < ans.length; i++) {
			
			if (i<ar.length) {
				ans[i] = ar[i];
			}
			else {
				ans[i] = ele;
			}
		}
		return ans;
	}
	
	public static int[] addEleLast1(int[]ar , int ele) throws InterruptedException {
		int [] ans = new int [ar.length+1];
		int i = 0,j = ar.length-1;
		while(i<=j) {
			ans[i] = ar[i];
			System.out.print(ans[i]+" : ");
			ans[j] = ar[j];
			System.out.println(ans[j]);
			i++;
			j--;
			
			
			Thread.sleep(2000);
		}
		ans[ans.length-1] = ele;
		return ans;
	}
}
