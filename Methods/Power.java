
import java.util.Scanner;
class Factorial  {
	// recursion
	// ex 2 ---> power of number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		System.out.print("Enter Power: ");
		int pow = sc.nextInt();
		System.out.print(pow +" Power of "+num+" is "+pow(pow ,num));
	}
	public static int pow(int pow ,int num){
		if (pow==0) {
			return 1;
		}
		return num*(pow(pow-1 ,num));
	}
}