package multipleInheritance;
// ex-1
public class SonDriver {

	public static void main(String[] args) {
		
		Father f = new Son();
		
		f.degree();
		f.marrage();
		
		// this field is static and should be accessed in static way
		//System.out.println(f.marks);
		System.out.println(Father.marks);
		Mother m = new Son();
		
		m.degree();
		m.marrage();
	
		// this field is static and should be accessed in static way
		//System.out.println(m.marks);
		System.out.println(Mother.marks);
	}
}
