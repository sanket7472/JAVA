class PrimeAddition 
{
	public static void main(String[] args) 
	{
		int start = 79;
		for (int i = 28; i<=50 ;i++ )
		{
			boolean prime = true;
			for (int j = 2;j<i ;j++ )
			{
				if (i % j == 0)
				{
					prime = false;
					break;
				}
			}
			if (prime)
			{
				System.out.print(start + "  ");
				start += i;
			}
		}
	}
}
