package arrays;

public class ElementsSum {

	public static int sum (int[]arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int [] arr  = {45,56,45,63,54,68,31,87,68,43};
		
		System.out.println("Sum of all elements from Array : "+ sum(arr));
	}
}
