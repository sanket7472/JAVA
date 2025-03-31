class NumSeries2 
{
	// print the number series 27,24,23
	public static void main(String[] args) 
	{
		int n = 28;
		for (int i = 1; i <= 10 ; i++ )
		{
			if (i % 2 == 0)
			{
				n-= 3;
				System.out.println(n);
			}
			else
			{
				n -= 1;
				System.out.println(n);
				
			}
		}
	}
}