class  Tringle2
{
	public static void main(String[] args) 
	{
		System.out.println(" lower left right angle tringle");
//                 4    4>=1
		for (int i = 5;i>=1 ;i --)
		{
			// Space            5-4
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
