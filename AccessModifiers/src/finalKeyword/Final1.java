package finalKeyword;

public class Final1 {

	public static void main(String[] args) {
		
		final int a ; // we can declare and leave a local final variable 
		
		// but initialization is mandetory before use
		a=10;
		//a = 100; // CTE because reinitialization not allowed
		
		System.out.println(a);
	}
}
