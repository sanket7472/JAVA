package multipleInheritance;
//ex-1
public class Son implements Father, Mother {
	
	/*
	 * The constructor call statements call the superclass .
	 * here the parent is a interfaces so the constructor directly calls the 
	 * Object class . the Ambiguity of constructor call is resolve using interfaces
	*/

	public Son() {
		super();
	}

	@Override
	public void degree() {
		
		System.out.println("BTech");
		// this field is showing ambiguous because the same member
		//is available in both the parents
		//System.out.println(marks);
		
	}

	@Override
	public void marrage() {
		
		System.out.println("not yet");
		
	}

}
