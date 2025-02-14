class Flower 
{
	public static void main(String[] args) 
	{
		int n = 15;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if (i==n/2||j==n/2 ||i==0&&j>n/2||i<n/2&&j==0|| i==n-1&&j<n*0.5||i>n/2&&j==n-1||i==j||i+j==n-1||i==(n/3)&&j==(n/4)-1||
					i==(n/4)-1&&j==n/3)
				{
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
