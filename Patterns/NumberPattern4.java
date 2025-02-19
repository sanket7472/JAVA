class NumberPattern4 
{
	public static void main(String[] args) 
	{
		/*
		2
		4  6
		8  10  12
		14 16  18  20
		*/
		int n = 4, a= 1;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(a*2 + " ");
				a++;
			}
			System.out.println();
		}
	}
}
