class Triangle1s
{
	public static void main(String[] args) 
	{
		System.out.println(" upper left right angle tringle");
		for (int i = 1;i<=5 ;i ++)
		{
			// Space
			for (int j = 1 ;j<=(5-i) ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1 ;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
