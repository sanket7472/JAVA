package arrays.twoDArray;

import java.util.Arrays;

public class RotateMatrix90d {

	public static void main(String[] args) {
		int [][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rotate90(a);
	}
	public static void rotate90(int[][]a) {
			a = transpose(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(revArray(a[i])));
		}
	}
	public static int[][] transpose(int[][]a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		return a;
	}
	
	public static int[] revArray(int[]a) {
		
		int i = 0,j=a.length-1;
		for (i = 0; i <j; i++,j--) {
			int temp = a[i];
			a[i]=a[j];
			a[j] =temp;
		}
		return a;
	}
	
}
