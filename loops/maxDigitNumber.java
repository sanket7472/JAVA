import java.util.Scanner;
class maxDigitNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		int max = 0;
		int min = 9;
		for (int i = num; i>0 ; i/=10 )
		{
			int dgt = i%10;
			//System.out.println(max + " : "+dgt);
			if (max<dgt)
			{
				max=dgt;
			}
			 if (min>dgt)
			{
				min=dgt;
			}
		}
		System.out.print("Largest digit from the number is : "+ max);
		System.out.print("\n Smallest digit from the number is : "+ min);
	}
}
