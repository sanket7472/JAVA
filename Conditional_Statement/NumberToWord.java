import java.util.Scanner;
class NumberToWord 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		
		String str = "";
		for(int i=num; i>0; i/=10)
		{
			int rem = i%10;
			switch (rem)
			{
				case 0 : str = "zero " +str;break;
				case 1 : str = "one " +str;break;
				case 2 : str = "two " +str;break;
				case 3 : str = "three " +str;break;
				case 4 : str = "four " +str;break;
				case 5 : str = "five " +str;break;
				case 6 : str = "six " +str;break;
				case 7 : str = "seven " +str;break;
				case 8 : str = "eaight " +str;break;
				case 9 : str = "nine " +str;break;
				
			}
		
		}
		System.out.print(str);
	}
}
