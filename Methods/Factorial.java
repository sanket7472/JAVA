
import java.util.Scanner;
class Factorial  {
	// recursion
// ex first ---> factorial of number
	public static void main(String[] args) {
		System.out.print("Enter Number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("Factorial of "+num+" is "+fact(num));
	}
	public static int fact(int num){
		if (num==0) {
			return 1;
		}
		return num*(fact(num-1));
	}
}