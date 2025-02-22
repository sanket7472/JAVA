import java.util.Scanner;
class SunnyNumber  
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = false;-
		for (int i = 2;i<=(num+1)/2 ;i++ )
		{
			if ((i*i) == (num+1))
			{
				flag = true;
				break;
			}
		}
		System.out.print(flag?  num + " is a sunny number ":num + " is not a sunny number ");
	}
}
