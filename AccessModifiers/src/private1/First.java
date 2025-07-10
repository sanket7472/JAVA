package private1;

public class First {

	private int a = 10;
	
	private First () {}
	
	private void  firstMethod() {
		System.out.println(" Printing from First class of private ");
	}
	
	public static void main(String[] args) {
		// accessing private members of same class
		
		 First f1 = new First();
		 
		 f1.firstMethod();
		 System.out.println(f1.a);
	}
}
