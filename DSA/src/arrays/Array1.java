package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		//int []ar2 = new int [-1];Exception in thread "main" java.lang.NegativeArraySizeException: -1
	//	at DSA/arrays.Array1.main(Array1.java:8)
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//arr[5]=50;
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		at DSA/arrays.Array1.main(Array1.java:14)

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		int arr2 [] = {1,2,5,4,6,1,2,3,5};
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr2[i]+"  ");
		}
	}
}
