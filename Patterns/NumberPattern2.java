class NumberPattern2 
{
	/*
	1
	2  4
	3  6  9
	4  8  12  16
	5  10 15  20  25
	*/
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1; j<=i ;j++ )
			{
				System.out.print(j*i +"  ");

			}
			System.out.println();
		}
	}
}
