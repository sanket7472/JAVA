class TringlePattern 
{
	public static void main(String[] args) 
	{
		System.out.println(" 1) upper left right ange tringle");
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
		System.out.println();
		System.out.println(" 2) lower left right ange tringle");
		for (int i = 5;i>=1 ;i --)
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
		System.out.println();
		System.out.println("3) upper right right angle tringle");
		for (int i = 1;i<=5 ;i++)
		{
			// Space
			/*for (int j = 1 ;j<=(5-i) ;j++ )
			{
				System.out.print("  ");
			}*/
			for (int j = 1 ;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("4) lower  left right angle tringle");
		for (int i = 5;i>=1 ;i --)
		{
			// Space
			/*for (int j = 1 ;j<=(5-i) ;j++ )
			{
				System.out.print("  ");
			}*/
			for (int j = 1 ;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("5) normal vertical tringle");
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
		System.out.println("6) inverted  tringle");
		for (int i = 5;i>=1 ;i--)
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
