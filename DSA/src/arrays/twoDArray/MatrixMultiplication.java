package arrays.twoDArray;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][]a = {
				{10,20,30,40},
				{10,20,30,40},
				{10,20,30,40},
				{10,20,30,40}
		};
		int [][]b = {
				{10,20,30,40},
				{10,20,30,40},
				{10,20,30,40},
				{10,20,30,40}
		};
		
		int [][] mul = multiply(a, b);
		for (int i = 0; i < mul.length; i++) {
			System.out.println(Arrays.toString(mul[i]));
		}
	}
	public static int[][] multiply(int[][]a,int[][]b){
		
		int [][] c= new int [a.length][a.length];
		
		  for (int i = 0; i < 4; i++) { // rows of a
	            for (int j = 0; j < 4; j++) { // columns of b
	                                                                                                     for (int k = 0; k < 4; k++) { // common dimension
	                    c[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }
		return c;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
