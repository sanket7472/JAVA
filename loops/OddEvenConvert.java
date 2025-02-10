import java.util.Scanner;
class OddEvenConvert 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter a number : ");
		int num = new Scanner (System.in).nextInt();
		int cnt = 0;
		int result = 0;
		int rev = 0;
	
		for (int i = num; i>0 ;i/=10 )
			cnt++;
		
		if (cnt%2==0)
		{
			System.out.println("The number Is of Even length that is "+cnt);
			System.out.print("The updated number : ");
			while(num>0)
			{
				if ((num%10)%2==0)
				{
					rev = num%10;
						//System.out.print(num%10);		
				}
				else if ((num%10)%2!=0)
				{
					rev = (num%10)+1 ;
					//System.out.print((num%10)+1);		
				}
				result =  (result*10)+rev;
				num/=10;
			}
		}
		
		else if (cnt%2!=0)
		{
			System.out.println("The number Is of Odd length that is "+cnt);
			System.out.print("The updated number : ");
			while (num>0)
			{
				if ((num%10)%2==0)
				{
					rev = (num%10)+1 ;
							
				}
				else if ((num%10)%2!=0)
				{
					rev = num%10;
						
				}
				num/=10;
				result =  (result*10)+rev;
				
				
			}
			
		}
		while(result>0)
		{
			System.out.print(result%10);
			result/=10;
		}
	}
}
