package Abstraction;

public class PrimeDriver {

	public static void main(String[] args) {
		
		AbsPrime a1 = new PrimeImp();
		
		a1.isPrime(10);
	}
}
