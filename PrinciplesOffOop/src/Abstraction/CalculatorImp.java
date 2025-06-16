package Abstraction;

public class CalculatorImp  extends Calculator{
	
	public CalculatorImp() {}

	// here all the abstract methods of parent class is implemented
	//or need to declare this class as a abstract class
	
	// we override abstract methods and update/modify them
	@Override
	public void addition(int a, int b) {
		
		System.out.println("result of addition "+ (a+b));
		
	}

	@Override
	public void subtraction(int a, int b) {
		
		System.out.println("result of subtraction "+ (a-b));
	}

	@Override
	public void multiplication(int a, int b) {
		
		System.out.println("result of multiplication "+ a*b);
	}

}
