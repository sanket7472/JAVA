import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();
		if (isPronic(num ))
		{
			System.out.print(num + " is an Pronic number ");
			return;
		}
		System.out.print(num + " is not an Pronic number ");
	}
	public static boolean isPronic(int num )
	{
		int i = 1;
		while (true)
		{
			if (i*(i+1)== num)
			{
				return true;
			}
			if (i*(i+1) > num)
			{
				return false;
			}
			i++;
		}
	}
}
