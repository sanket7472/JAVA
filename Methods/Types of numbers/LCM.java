import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println( "LCM is "+lcm(num1,num2));
	}
	public static int lcm(int num1 , int num2)
	{
		int max = num1>num2 ? num1 :num2;
		int i = 1;
		while (true)
		{
			if ((max*i)%num1==0 && (max*i)%num2==0)
			{
				return max*i;
			}
			i++;
		}
		
	}
}
