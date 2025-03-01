import java.util.Scanner;
class PrimeFromUserRange  {
	public static void main(String[] args) {
		System.out.print("Enter Start : ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("Enter End : ");
		int end = new Scanner(System.in).nextInt();
		while (num<=end) {
			if (isPrime(num)) {
			System.out.print(num + "  ");
			
			}
		num++;
		
		}
	}
	public static boolean isPrime(int num){
		int den = 2;
		while(den<num) {
			if (num%den == 0) {
				return false;
			}
			den++ ;
		}
		return true;
	}
}