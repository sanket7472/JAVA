package arrays.twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of columns : ") ;
		int col = sc.nextInt();
		System.out.print("Enter number of rows : ") ;	
		int rows = sc.nextInt();
		int [][] ar = new int [rows][col];
		System.out.println("Enter the values : ");
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Entered elements are : ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(Arrays.toString(ar[i]));
		}
		sc.close();
	}
}
