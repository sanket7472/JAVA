package typecasting;

public class FatherSonDriver {
	
	public static void main(String[] args) {
		
		Father f = new Father();
		
		Son s = (Son) f;// Class cast exception
		
		s.drinking();
		s.smoking();
	}
}
