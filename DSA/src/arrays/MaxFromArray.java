package arrays;

public class MaxFromArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,4,5,6,1,2,8,9,9,9};
		firstThreeMax1(arr);
	}

	public static void firstThreeMax(int[]ar) {
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]>max) {
				thirdMax = secMax;
				secMax = max;
				max = ar[i];
			}
			else if (ar[i]>secMax && ar[i]!=max) {
				thirdMax = secMax;
				secMax = ar[i];
			}
			
			else if (ar[i]>thirdMax && ar[i]!=max && ar[i]!= secMax) {
				
				thirdMax = ar[i];
			}
		}
		
		System.out.println("Max number : "+max);
		System.out.println("Second Max number : "+secMax);
		System.out.println("Third Max number : "+thirdMax);
	}
	
	public static void firstThreeMax1(int[]ar) {
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for (int i = 0, j = ar.length-1; i <= j; i++,j--) {
			
			int armax = ar[i]>ar[j]?ar[i]:ar[j];
			
			if (armax>max) {
				thirdMax = secMax;
				secMax = max;
				max = armax;
			}
			else if (armax>secMax ||(ar[i]<ar[j]?ar[i]:ar[j])<max  && armax!=max) {
				thirdMax = secMax;
				secMax = armax;
			}
			
			else if (armax>thirdMax && armax!=max && armax!= secMax) {
				
				thirdMax = armax;
			}
		}
		
		System.out.println("Max number : "+max);
		System.out.println("Second Max number : "+secMax);
		System.out.println("Third Max number : "+thirdMax);
	}
}
