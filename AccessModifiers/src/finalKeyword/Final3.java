package finalKeyword;

public class Final3 {

	//final String name;// CTE bcz not initialized
	
	
	// we can declare and leave a static final variable 
	// but initialization is mandetory before use otherwise CTE
	// 1) only declare
	final int size;
	final char grade;
	// initialize
	// 1) direct
	final double price = 100000.0;
	
	// 2) in non-static block
	{
		size = 10;
	}
	
	// 3) in constructor body 
	
	public Final3() {
		
		this.grade = 'a';
	}
}
