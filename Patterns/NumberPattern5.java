class NumberPattern5 
{
	public static void main(String[] args) 
	{
		/*
		output
		1
		3  2
		6  5  4
		10 9  8  7
		15 14 13 12 11
		*/
		int n = 5;
		int num= 1;
		for (int i = 1;i<=n ;i++ )
		{
			int temp = num;
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print((temp--)+" ");
				
			}
			num += i+1;
			System.out.println();
		}
	}
}
