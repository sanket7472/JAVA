package arrays.twoDArray;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][]a = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		char [][] b = {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'}
		};
		transpose(a);
		transpose(b);
	}
	public static void transpose(int [][]a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				//if (j>i) {
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				//}
			}
		}
		System.out.println("Transposed Matrix : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	public static void transpose(char [][]a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				//if (j>i) {
					char temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				//}
			}
		}
		System.out.println("Transposed Matrix : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
