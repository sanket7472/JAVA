class C_Pattern 
{
	public static void main(String[] args) 
	{
		int n = 15;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if (j==0||i==n-1&&j<n/2||i==0&&j<n/2||i<n/4&&j==n/2||i>(3*n/4)&&j==n/2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
