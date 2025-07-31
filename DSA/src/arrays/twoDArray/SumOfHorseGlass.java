package arrays.twoDArray;

public class SumOfHorseGlass {

	public static void main(String[] args) {
		int [][] a = {
				{1,1,1},
				{0,1,0},
				{1,1,1}
		};
		System.out.println(sum(a));
	}
	public static int sum(int[][]a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum+=a[i][j];
			}
		}
		return sum;
	}
}
