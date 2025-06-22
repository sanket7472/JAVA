package interfaceExamples.numberSeries;

public class NumbersImp  implements Numbers{

	@Override
	public boolean isPrime(int num) {
		for (int i = 2; i<=num/2 ; i++) {
			
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isEven(int num) {
		
		return num % 2 ==0;
	}

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return num % 2 !=0;
	}

	@Override
	public void returnNumber() {
		
		int evenNum = 0;
		int oddNum = 0;
		int primeNum = 0;
		for(int i = start;i<=end;i++) {
			
			if(isEven(i)) {
				//System.out.println(i+" is a Even Number ");
				evenNum++;
			}
			if(isOdd(i)) {
				//System.out.println(i+" is a Odd Number ");
				oddNum++;
			}
			if(isPrime(i)) {
				//System.out.println(i+" is a Prime Number ");
				primeNum++;
			}
//			System.out.println();
		
		}
		System.out.println("Total prime numbers : "+ primeNum );
		System.out.println("Total even numbers : "+ evenNum );
		System.out.println("Total odd numbers : "+ oddNum );
		
	}

	

}
