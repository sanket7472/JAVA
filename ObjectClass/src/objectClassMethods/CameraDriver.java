package objectClassMethods;

public class CameraDriver {

	public static void main(String[] args) {
		
		HashcodeOverride c1 = new HashcodeOverride("Canon", 10000.0, 4, 108, true);
		HashcodeOverride c2 = new HashcodeOverride("Canon", 10000.0, 4, 108, true);
		
		System.out.println(c1.toString());
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
