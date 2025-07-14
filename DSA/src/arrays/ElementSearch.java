package arrays;

public class ElementSearch {

	public static boolean elementSearch(int[]arr , int ele) {
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==ele) {
				
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		System.out.println(elementSearch(arr, 110));
	}
}
