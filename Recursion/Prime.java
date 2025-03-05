class Prime{
	public static void main(String[] args) {
		if (isPrime(num , 2)) {
			System.out.print(num + " is a prime number");
		}
		else 
			System.out.print(num +" is not a prime number");
	}
	public static boolean isPrime(int num , int den )
	{
		if (den == num/2) {
			return true;
		}
		if (num%den == 0) {
			return false;
		}
	return isPrime(num , ++den);
	}
}