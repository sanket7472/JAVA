package arrays;

import java.util.Arrays;

public class AlphabetSeperate {
	// [ consonents --> vouls ]

	public static void main(String[] args) {
		
		int [] ar = {'a','g','v','s','a','n','k','e','t'};
		separateAlphabet(ar);
	}
	public static void separateAlphabet(int[] arr) {
		
		int i = 0, j = arr.length-1;
		
		while(i<j) {
			
			while (i != 'a' &&  i != 'e' &&  i != 'i' && i != 'o'&&  i != 'u' ) {
				System.out.println("i : "+i);
				i++;
			}
			while(j == 'a' ||  j == 'e' ||  j == 'i' || j == 'o'||  j == 'u' ) {
				System.out.println("j :"+ j);
				j--;
			}
			
			if (i<j) {
				
				arr[i] = (arr[i] + arr[j]);
				arr[j] = (arr[i] - arr[j]);
				arr[i] = (arr[i] - arr[j]);
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
