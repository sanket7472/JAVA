package interfaceExamples.numberSeries;

public interface Numbers {

	
	int start = 1;
	int end = 1000000;
	
	
	// this is a design of methods which founds odd, even , and prime from the range start to end 
	
	boolean isPrime(int num);
	
	boolean isEven(int num);
	
	boolean isOdd(int num);
	
	void returnNumber();
}
