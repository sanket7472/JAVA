package Abstraction;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		// here we did the up casting for accessing members of only superclass 
		// because the object type is parent and compile time binding should be with members of superclass
		// at the run time the member is executed because JVM make the binding with the reference type and here
		// reference is of subclass type.
		Calculator c1 = new CalculatorImp();
		
		c1.addition(10,20);
		c1.subtraction(25, 5);
		c1.multiplication(10, 20);
		c1.division(50, 10);
	}
}
