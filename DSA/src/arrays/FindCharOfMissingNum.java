package arrays;

public class FindCharOfMissingNum {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,2,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		System.out.println(returnChar(ar));
		System.out.println(returnCharOfMissPos(ar));
	}
	public static char returnChar(int[]ar) {
		int[]cnt = new int[ar.length] ;
		int j=0;
		while (j<cnt.length) {
			int num = ar[j];
			//System.out.println(j+"  "+ar[j]);
			cnt[num-1]++;
			//System.out.println(Arrays.toString(cnt));
			j++;
		}
		int i = 0;
		while (i<cnt.length) {
			if (cnt[i]==0) {
				break;
			}
			i++;
		}
		return (char)(i+65);
	}
	public static char returnCharOfMissPos(int[]ar) {
		
		ar = removeDup(ar);
		int sumAr = 0,sum=0;
		for (int i = 0; i < ar.length; i++) {
			sumAr+=ar[i];
		} 
		sum = (ar.length * (ar.length+1))/2;
		//System.out.println(sum-sumAr);
		return (char)((sum-sumAr)+64);
	}
	public static int[] removeDup(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				for (int j = i+1; j < ar.length; j++) {
					
					if (ar[i]==ar[j]) {
						ar[j] = 0;
					}
				}
			}
		}
		return ar;
	}
}
