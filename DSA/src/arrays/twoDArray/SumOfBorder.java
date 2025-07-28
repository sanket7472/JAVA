package arrays.twoDArray;

public class SumOfBorder {

	public static void main(String[] args) {
		int ar[][] = {
				{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,3,4}	
		};
		System.out.println(sumOfBorderEle(ar));
	}
	public static int sumOfBorderEle(int [][] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i==0||j==0||i==ar[i].length-1||j==ar[i].length-1) {
				//	System.out.println(ar[i][j]);
					sum += ar[i][j];
				}
			}
		}
		return sum;
	}
}
