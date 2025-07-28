package arrays.twoDArray;

public class SumOfEle {

	public static void main(String[] args) {
		int ar[][] = {
				{1,2,3},{4,5,6},{7,8,9}	
		};
		System.out.println(sumOfArrDiaEle(ar));
	}
	public static int sumOfArrEle(int [][] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum += ar[i][j];
			}
		}
		return sum;
	}
	public static int sumOfArrDiaEle(int [][] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i==j || i+j == ar.length-1) {
					sum += ar[i][j];
				}
			}
		}
		return sum;
	}
}
