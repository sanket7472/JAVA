package arrays;

import java.util.Arrays;

public class RemoveRange {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println(Arrays.toString(removeRange(arr, 2, 6)));
	}
	public static int[] removeRange(int[]ar,int start, int end) {
		
		if (start>=0 && start<=end && end<ar.length) {
			
			int[] ans = new int[ar.length-(end-start)];
			for (int i = 0; i < ar.length;) {
				
				if (i<start) {
					ans[i]=ar[i];
					i++;
				}
				else if (i==start) {
					
					i = i+ (end-start);
				}
				else if (i>=end) {
					
					ans[i-(end-start)] = ar[i];
					i++;
				}
			}
			return ans;
		}
		return ar;
	}
	
	// making a method for inclusive removal of range 
	// in it we removes the end index also 
	//that is removeRange(int[]ar,int start, int end) method only removes the 
	// elements till the end not the end indexed element
	
	public static int[] removeRange(int[]ar,int start,int end,boolean inc) {
		
		if (inc) {
			return removeRange(ar, start, end+1);
		}
		return removeRange(ar, start, end);
	}
	
	
}
