class SquareInSquarePatt 
{
	/*
	output
* * * * * * * * * * * * * * *
* *                       * *
*   *                   *   *
*     *       *       *     *
*       *   *   *   *       *
*         *       *         *
*       *   *   *   *       *
*     *       *       *     *
*       *   *   *   *       *
*         *       *         *
*       *   *   *   *       *
*     *       *       *     *
*   *                   *   *
* *                       * *
* * * * * * * * * * * * * * *
*/
	public static void main(String[] args) 
	{
		System.out.println();
		int n = 15;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=n ;j++ )
			{
				if (i==1||j==1||i==n||j==n ||i==j||i+j==n+1||i==(n/4)+1&&j==(n/2)+1||i==(n/2)+1&&j==(n)-(n/4)
					||j==(n/2)+1&&i==(n)-(n/4)||i==(n/2)+1&&j==(n/4)+1||j==n/2&&i==(n/4)+2 ||j==(n/2)+2&&i==(n-(n/4)-1)
					|| i==n/2&&j==n/3 ||i==n/2&&j==((2*n)/3)+1||j==n/2&&i==(n-(n/4)-1)||j==(n/2)+2&&i==(n/4)+2
					||j==((2*n)/3)+1&&i==(n/2)+2||j==(n/3)&&i==(n/2)+2)
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