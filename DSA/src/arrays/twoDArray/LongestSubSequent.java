package arrays.twoDArray;

public class LongestSubSequent { 

	public static void main(String[] args) {
		int [] a = {1,1,1,0,0,2,2,2,1,1,1,1,2,3};
		longestSubSeq(a);
		secLonSubSeq(a);
	}
	public static void longestSubSeq(int [] a) {
		
		int max = 0, ct = 0,num=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				ct++;
			}
			else {
				if (ct>max) {
					max=ct;
					num=a[i];
				}
				ct=0;
			}
		}
		if (ct>max) {
			max=ct;
			num = a[a.length-1];
		}
		if (max!=0) {
			System.out.println(num +" is repeated for "+(max+1)+" times.");
		}
		else {
			System.out.println("Not any longest subsequence found");
		}
	}
	
	public static void secLonSubSeq(int [] a) {
		
		int max = 0,secMax=0, ct = 0,num=0,secNum=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				ct++;
			}
			else {
				if (ct>max) {
					secMax=max;
					max=ct;
					secNum = num;
					num=a[i];
				}else if (ct>secMax && ct!=max) {
					secMax=ct;
					secNum = a[i];
				}
				ct=0;
			}
		}
		if (ct>max) {
			secMax=max;
			max=ct;
			secNum = num;
			num = a[a.length-1];
		}
		if (secMax!=0) {
			System.out.println(secNum +" is repeated for "+(secMax+1)+" times.");
		}
		else {
			System.out.println("Not any second longest subsequence found");
		}
	}
}
