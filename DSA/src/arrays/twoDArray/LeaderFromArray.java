package arrays.twoDArray;

public class LeaderFromArray {

	/*yy
	 *  Finding which element is leader in the array
	 * condition :---> the element have all the small element at its right 
	 * 					And the right-most element is always leader
	 *
	 *		Ex --> input array ----> {16,17,4,3,5,2}
	 *				output ---> 17,5,2
	 * */
	public static void main(String[] args) {
		
		int [] a = {16,17,4,3,5,2};
		leaders(a);
	}
	public static void leaders(int [] a) {
		
		for (int i = 0; i < a.length; i++) {
			int j;
			for ( j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
					break;
				}
			}
			if (j==a.length) {
				System.out.print(a[i] +" ");
			}
		}
	}
}
