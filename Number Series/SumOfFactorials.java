class SumOfFactorials 
{
	public static void main(String[] args) 
	{
		int num = 7;
		
		for (int i = 1;i<=num ;i++ )
		{
			int sum=0;
			for (int j = 1;j<=i ;j++ )
			{
				int fact = 1;
				for (int k = 1;k<=j ;k++ )
				{
					fact*=k;
				}
				sum += fact;
			}
			
			System.out.print(sum +"  ");
		}
	}
}
