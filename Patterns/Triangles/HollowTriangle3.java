class HollowTriangle3 
{
	public static void main(String[] args) 
	{

		/*
		output
		* * * * *
		  *     *
		    *   *
			  * *
			    *

		*/
		int n = 15;
		for (int i = n; i>=1; i-- )
		{
			for (int j = 1;j<=(n-i) ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<=i ;j++ )
			{
				if (i==n||j==1||i==j)
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
