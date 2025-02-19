class HollowTriangle5 
{
	public static void main(String[] args) 
	{
			System.out.println("Vertical triangle ....");
		/* 
		output
		          *
				*   *
		      *       *
			*           *
		  * * * * * * * * *
		  */
		int n = 5;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=(n-i) ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<=i ;j++ )
			{
				if (j==1||i==n)
				{
					System.out.print("* ");
				}
				else 
				System.out.print("  ");
			}
			for (int j = 2;j<=i ;j++ )
			{
				if (i==n||i==j)
				{
					System.out.print("* ");
				}
				else 
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
