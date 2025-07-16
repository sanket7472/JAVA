package arrays;
import java.util.Arrays;

public class OddEvenArray {

	public static int[] makeEven(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]%2==0 ? arr[i] : arr[i]+1;
		}
		return arr;
	}
	public static int[] makeOdd(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]%2==0 ? arr[i]+1 : arr[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,15,20,25,30,35,40};
		
		//System.out.println(Arrays.toString(makeEven(arr))); 
		// this statement update the values  of array element
		System.out.println(Arrays.toString(makeOdd(arr)));
	}
}
