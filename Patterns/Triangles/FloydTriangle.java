class FloydTriangle 
{
	/*
	
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	*/
	public static void main(String[] args) 
	{
		floyd(5);
	}
	public static void floyd(int n )
	{
		int a = 1;
		for (int i = 0;i<=n ;i++ )
		{
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
		
	}
}
