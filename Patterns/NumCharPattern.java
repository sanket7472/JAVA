class NumCharPattern 
{
	public static void main(String[] args) 
	{
		// output
		/*
			a
			1  2
			b  c  d
			3  4  5  6
			e  f  g  h  i
		*/

		int n= 5, num = 1;
		char ch = 'a';
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=i ;j++ )
			{
				if (i%2!=0)
				{
					System.out.print((ch++)+" ");
				}

				else 
					System.out.print((num++)+" ");
			}
			System.out.println();
		}
		
	}
}
