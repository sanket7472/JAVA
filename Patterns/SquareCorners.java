class SquareCorners 
{
	//This Pattern shows the four squares at the edge of middle square
	public static void main(String[] args) 
	{
		int n = 15;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i==1 &&j<n/4||j==n||i==n||j==1 || j==n/4 ||i==n/4||j==(4*n/5)+1||i==(4*n/5)+1||i==1&&j>(4*n/5)+1)
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
