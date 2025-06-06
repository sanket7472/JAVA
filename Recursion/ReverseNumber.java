import java.util.Scanner;
class ReverseNumber 
{
	// this code make the user entered number reverse
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.print("Reverse number Of "+num +" is - "+reverse(num , 0));
	}
	public static int reverse(int num , int rev )
	{
		/*
  // this method is designed for reverse a number
		// normal method
		if (num == 0)
		{
			return rev ;
		}
		return reverse (num/10 , (rev*10)+(num%10));
*/
		// optimized method
		return num == 0 ? rev : reverse (num/10 , (rev*10)+(num%10));
	}
}
