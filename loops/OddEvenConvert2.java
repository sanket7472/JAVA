import java.util.Scanner;
class OddEvenConvert2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number :");
		int num = new Scanner(System.in).nextInt();
		int dup = num ;
		int cnt = 0;
		while (num>0)
		{
			cnt++;
			num/=10;
		}
		String newNum = "";
		if (cnt%2==0)
		{
			int rem = 0;
			for (int i=dup; i>0 ;i/=10 )
			{
				rem = i%10;
				if (rem%2!=0)
				{
					newNum= ++rem +newNum;		
				}
				else
				{
					newNum= rem +newNum;
				}

			}
		}
		else if (cnt%2!=0)
		{
			int rem = 0;
			for (int i=dup; i>0 ;i/=10 )
			{
				 rem = i%10;
				if (rem%2==0)
				{
					newNum= ++rem +newNum;		
				}
				else
				{
					newNum= rem +newNum;
				}
		}
	}
	System.out.println("original number : updated number");
	System.out.print(dup + " : "+newNum);
}
}
