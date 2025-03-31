class NumSeries 
{
	// print the number series 21, 1 ,21 ,3 ,21 ,5 , 21 ,7.......... 
	public static void main(String[] args) 
	{
		int cnt = 0;
		for (int i = 1; i <= 10 ; i++ )
		{
			if (i % 2 != 0)
			{
				System.out.println("21");
			}
			else
				System.out.println(i-1);
		}
	}
}
