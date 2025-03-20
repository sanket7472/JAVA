import java.util.Scanner;
class EvenSum 
{
	// This code returns sum of even digits from number.
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum=0;
		int evenSum = 0 ;
		int oddSum = 0;

		while (num>0)
		{
			int rem = num%10;
			if (rem%2 == 0)
			{
				sum += rem;
				evenSum += rem;

			}
			else 
			{
				sum += rem;
				oddSum +=rem;
			}
				num /= 10;
		}

		System.out.println("Sum of all digits : "+sum);
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
