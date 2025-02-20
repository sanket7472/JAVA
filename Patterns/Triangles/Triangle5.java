class Triangle5 
{
	public static void main(String[] args) 
	{
		System.out.println(" normal vertical tringle");
		for (int i = 1;i<=5 ;i++)
		{
			// Space
			for (int j = 1 ;j<=(5-i) ;j++ )
			{
				System.out.print(" ");
			}
			for (int j = 1 ;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
