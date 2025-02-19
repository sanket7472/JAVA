class NumberPattern3 
{
	public static void main(String[] args) 
	{
		/*
		1
		2  3
		4  5  6
		7  8  9  10
		11 12 13 14  15
		*/
		int n = 5, a=1;
		for (int i = 1;i<=n ;i++)
		{
			for (int j = 1;j<=i ;j++ )
			{
				// reduced space for perfect triangle look
				if (a<=9)
				{
					System.out.print(a +"  ");
				}
				else
					System.out.print(a +" ");
				a++;
			}
			System.out.println();
		}
	}
}
