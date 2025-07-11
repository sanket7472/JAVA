package private1;

public class WrapCase1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		Integer i1 = new Integer(a);
		Integer i2 = new Integer(b);
		
		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // true
		
		Integer a1 = a;
		Integer b1 = b;
		
		System.out.println(a1 == b1); // true bcz of auto unboxing is done 
									  //internally and compare with values  
	}
}
