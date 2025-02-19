class HollowTriangle6
{
	public static void main(String[] args) 
	{

		/*
		output

		  * * * * * * * * *
		    *           *
		      *       *
			    *   *
				  *

				  */
		int n = 5;
		for (int i = n;i>=1 ;i-- )
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
