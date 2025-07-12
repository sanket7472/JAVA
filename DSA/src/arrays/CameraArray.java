package arrays;

public class CameraArray {

	public static void main(String[] args) {
		
		Camera arr [] = new Camera [3];
		
		arr[0] = new Camera("Canon", 15000.0, 4, 108, true) ;
		arr[1] = new Camera("MI", 11000.0, 4, 108, true) ;
		arr[2] = new Camera("Canon", 15000.0, 4, 108, true) ;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
