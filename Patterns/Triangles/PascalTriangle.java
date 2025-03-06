class PascalTriangle 
{
	/*
	    1
          1   1
        1   2   1
      1   3   3   1
    1   4   6   4   1
  1   5   10   10   5   1

	*/
	public static void main(String[] args) 
	{
		triangle(6);
	}
	public static void triangle(int num )
	{
		for (int i = 0;i<num ;i++ )
		{
			// Space
			for (int j = 0;j<=(num-i)-1 ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j = 0;j<=i ;j++ )
			{
				System.out.print(fact(i)/(fact(j)*fact(i-j))+"   ");
				//System.out.print(" *"+"  ");
			}
			System.out.println();
		}
	}
	public static int fact(int num )
	{
		int fact = 1;
		for (int i = num;i>0 ;i-- )
		{
			fact *= i;
		}
		return fact;
	}
}
