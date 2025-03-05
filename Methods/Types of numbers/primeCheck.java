import java.util.Scanner;
class primeCheck {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num)) {
			System.out.print(" Prime Number ");
		}
		else{
			System.out.print("Not a Prime Number");
		}
	}
	public static boolean isPrime(int num){
		int den = 2;
		for (;den<num ;den++ ) {
			if (num%den == 0) {
				return false;
			}
		}
		return true;
	}
}