package collection.tree;

public class IntegerDoubt {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a==b); // true
		Integer c = Integer.valueOf(130);
		Integer d = new Integer(130);;
		System.out.println(c==d); // false
	}
}
