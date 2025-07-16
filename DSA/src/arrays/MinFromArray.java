package arrays;

public class MinFromArray {


	
	public static void main(String[] args) {
		
		int [] arr = {1,4,5,6,1,2,3,5,8,9,9,9};
		firstThreeMin(arr);
	}

	public static void firstThreeMin(int[]ar) {
		
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]<min) {
				thirdMin = secMin;
				secMin = min;
				min = ar[i];
			}
			else if (ar[i]<secMin && ar[i]!=min) {
				thirdMin = secMin;
				secMin = ar[i];
			}
			
			else if (ar[i]<thirdMin && ar[i]!=min && ar[i]!= secMin) {
				
				thirdMin = ar[i];
			}
		}
		
		System.out.println("Min number : "+min);
		System.out.println("Second Min number : "+secMin);
		System.out.println("Third Min number : "+thirdMin);
	}

}
