import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number between 0 to 999 :   ");
		int num = new Scanner(System.in).nextInt();
		int numOG = num;
		int product = 1;
		int temp;
		int evenSum = 0;
		int oddSum = 0;
		product = product *num%10;
		temp = ((num%10)%2==0)?(evenSum = evenSum + (num%10)):(oddSum = oddSum + (num%10));
		num = num/10;

		temp = ((num%10)%2==0)?(evenSum = evenSum + (num%10)):(oddSum = oddSum + (num%10));
		product = product *(num%10);
		num = num/10;

		temp = ((num%10)%2==0)?(evenSum = evenSum + (num%10)):(oddSum = oddSum + (num%10));
		product = product * (num%10);
		num = num/10;

		temp = ((num%10)%2==0)?(evenSum = evenSum + (num%10)):(oddSum = oddSum + (num%10));
		product = product * (num%10);
	
		System.out.println("For number : "+numOG+" Product Of Digits in num : " + product  );
		System.out.println("Even sum is : " + evenSum + "  & OddSum is :" + oddSum);

	}
}

