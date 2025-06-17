package Abstraction;

public class PrimeImp extends AbsPrime {
	
	public PrimeImp() {}

	@Override
	public void isPrime(int num) {
		
			
			for(int i = 2 ; i<=num/2 ; i++)
			{
				if(num%i == 0)
				{
					System.out.println("Number is not prime ");
					return;
				}
				
			}
			System.out.println("Number is prime");
			
		
		
	}




}
