import java.util.Scanner;
class KrishnmurtiNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System,in).nextInt(); 
			int sum = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			int fact = 1;
			for (int j = 1;j<=(i % 10) ;j++ )
				fact *=j;
			sum += fact;
		}
		System.out.print(sum==num?num+" is A Krish Number":num+" Not a krish number");
	}
}
