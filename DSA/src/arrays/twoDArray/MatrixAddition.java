package arrays.twoDArray;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		
		int [][]a = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		int [][]b = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		
		addMatrix(a, b);
	}
	public static void addMatrix(int[][]a,int[][]b){
		
		if (a.length==b.length) {
			int i ;
			for ( i = 0; i < a.length; i++) {
				if (a[i].length!=b[i].length) {
					break;
				}
			}
			if (i==a.length) {
				int [][]c = new int [a.length][a[0].length];
				
				for (int j = 0; j < c.length; j++) {
					for (int j2 = 0; j2 < c.length; j2++) {
						c[j][j2] = a[j][j2]+b[j][j2];
					}
				}
				System.out.println("Resultant / Addition Matrix :");
				for (int j2 = 0; j2 < c.length; j2++) {
					System.out.println(Arrays.toString(c[j2]));
				}
			}
			else {
				System.out.println("Matrix Should be of same diamentions ...!");
			}
		}else {
			System.out.println("Matrix Should be of same diamentions ...!");
		}
	}
}
