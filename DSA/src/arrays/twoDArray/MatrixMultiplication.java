package arrays.twoDArray;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int [][]b = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		int [][] mul = multiply(a, b);
		for (int i = 0; i < mul.length; i++) {
			System.out.println(Arrays.toString(mul[i]));
		}
	}
	public static int[][] multiply(int[][]a,int[][]b){
		
		int [][] c= new int [a.length][a[0].length];
		
		  for (int i = 0; i < a.length; i++) { 
	            for (int j = 0; j < a.length; j++) {
	                   for (int k = 0; k < c.length; k++) {
	                	   c[i][j] += a[i][k] * b[k][j];
					}                                                                                 
	            }
	        }
		return c;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
