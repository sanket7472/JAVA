package private1;

public class PrimitiveToString {
 
	public static void main(String[] args) {
	
		System.out.println("Converting Primitive data to String using valueOf()");
		System.out.print("byte to String : ");
		byte b= 100;
		String s = String.valueOf(b);
		System.out.println(s);
		System.out.print("short to String : ");
		short sh= 150;
		String a = String.valueOf(sh);
		System.out.println(a);
		System.out.print("int to String : ");
		int i = 1100;
		String i1 = String.valueOf(i);
		System.out.println(i1);
		System.out.print("long to String : ");
		long l = 11100;
		String l1 = String.valueOf(l);
		System.out.println(l1);
		System.out.print("char to String : ");
		char ch= 'a';
		String c = String.valueOf(ch);
		System.out.println(c);
		System.out.print("float to String : ");
		float f = 1.145f;
		String f1 = String.valueOf(f);
		System.out.println(f1);
		System.out.print("double to String : ");
		double d= 100.145;
		String d1 = String.valueOf(d);
		System.out.println(d1);
		
		System.out.print("boolean to String : ");
		boolean z= true;
		String z1 = String.valueOf(z);
		System.out.println(z1);
		
	}
}
