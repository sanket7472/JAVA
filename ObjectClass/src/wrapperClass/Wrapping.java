package wrapperClass;

public class Wrapping {

	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(a); // boxing
		// showing warning bcz of constructors of Wraper classes are depricated;
		int b = i.intValue(); // Unboxing
		System.out.println(i+"----------------->"+b);
		
		Byte b2 = new Byte((byte)10);
		byte b3 = b2.byteValue();
		System.out.println(b2+"-------------->"+b3);
		
		Short s = new Short((short)100);
		short s1 = s.shortValue();
		System.out.println(s+"-------------->"+s1);
		
		Long l = new Long(120);
		long l1 = l.longValue();
		System.out.println(l+"-------------->"+l1);
		
		Character c = new Character('a');
		char ch = c.charValue();
		System.out.println(c+"-------------->"+ch);
		
		Float f = new Float(10.5);
		float f1= f.floatValue();
		System.out.println(f+"-------------->"+f1);
		
		Double d = new Double(100.10);
		double d1 = d.doubleValue();
		System.out.println(d+"-------------->"+d1);
		
		Boolean b4 = new Boolean(false);
		boolean b5 = b4.booleanValue();
		System.out.println(b4+"-------------->"+b5);
	}
}
