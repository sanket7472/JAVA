package Abstraction;

public abstract class Calculator {

	// no-args constructor for loading the parent class members. 
	public Calculator() {}
	
	
	// abstract methods (without body - only declare);
	public abstract void addition(int a, int b);
	public abstract void subtraction(int a, int b);
	public abstract void multiplication(int a, int b);
	
	// concrete method can define in abstract class
	
	public void division(int a, int b) {
		
		System.out.println("result of divison "+ a/b);
	}
	
	
}
